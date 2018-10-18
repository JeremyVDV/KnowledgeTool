package nl.jeremyvdveen.knowledgetool.application.controller;

import java.util.concurrent.atomic.AtomicLong;

import nl.jeremyvdveen.knowledgetool.application.model.Hero;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Value("${server.port}")
    private int serverPort;

    @RequestMapping("/greeting")
    public Hero greeting(@RequestParam(value="name", defaultValue="Mehmet") String name) {
        return new Hero(counter.incrementAndGet(),
                String.format(TEMPLATE, name));
    }
}
