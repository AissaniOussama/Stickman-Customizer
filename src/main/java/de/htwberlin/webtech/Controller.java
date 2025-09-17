package de.htwberlin.webtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
This Class is providing API-CALL URLS for saving Stickman into the Database,
and returning the Stickman-Table with all Saved Stickman.
 */

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private StickmanService service;

    @PostMapping("/stickmans")
    public Stickman create(@RequestBody Stickman stickman) {
        System.out.println("POST erhalten: " + stickman);
        return service.save(stickman);
    }


    //API-Call Adress for all the Stickman
    @GetMapping("/stickmans")
    public List<Stickman> getAll() {
        return service.getAll();
    }

}
