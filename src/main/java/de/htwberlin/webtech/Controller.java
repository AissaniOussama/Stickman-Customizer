package de.htwberlin.webtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private StickmanService service;

    @PostMapping("/stickmans")
    public Stickman create(@RequestBody Stickman stickman) {
        return service.save(stickman);
    }

    @GetMapping("/stickmans")
    public List<Stickman> getAll() {
        return service.getAll();
    }
}
