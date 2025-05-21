package de.htwberlin.webtech;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/Stickman")
    public List<Stickman> LogInDataRouteTest() {
        return List.of(
                new Stickman("Stickman1", "SwagKeys for the Attributes"),
                new Stickman("Stickman2", "SwagKeys for the Attributes"),
                new Stickman("Stickman3", "SwagKeys for the Attributes")
        );
    }


    @GetMapping("/Stickmans")
    public List<Stickman> getAllThings() {
        return LogInDataRouteTest();

    }
}