package de.htwberlin.webtech;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/Stickman")
    public List<Stickman> LogInDataRouteTest() {
        return List.of(
                new Stickman("Stickman1", "SwagKeys for the Attributes"),
                new Stickman("Stickman2","SwagKeys for the Attributes"),
                new Stickman("Stickman3","SwagKeys for the Attributes")
        );
    }
}



