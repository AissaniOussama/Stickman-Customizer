package de.htwberlin.webtech;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        logger.info("Test endpoint called");
        return "{\"message\": \"API is working!\"}";
    }

    @GetMapping(value = "/stickman", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Stickman> LogInDataRouteTest() {
        logger.info("Stickman endpoint called");
        return List.of(
                new Stickman("Stickman1", "SwagKeys for the Attributes"),
                new Stickman("Stickman2", "SwagKeys for the Attributes"),
                new Stickman("Stickman3", "SwagKeys for the Attributes")
        );
    }

    @GetMapping(value = "/stickmans", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Stickman> getAllThings() {
        logger.info("Stickmans endpoint called");
        return LogInDataRouteTest();
    }
}