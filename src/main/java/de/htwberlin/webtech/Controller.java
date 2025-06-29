package de.htwberlin.webtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private StickmanService service;

    @CrossOrigin(origins = "*")
    @PostMapping("/stickmans")
    public Stickman create(@RequestBody Stickman stickman) {
        System.out.println("POST erhalten: " + stickman);
        return service.save(stickman);
    }

    @GetMapping("/stickmans")
    public List<Stickman> getAll() {
        return service.getAll();
    }

    @GetMapping("/stickmans/{id}")
    public Stickman getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/stickmans/owner/{owner}") // NEU
    public List<Stickman> getByOwner(@PathVariable String owner) {
        return service.getByOwner(owner);
    }
}
