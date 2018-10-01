package nl.jeremyvdveen.knowledgetool.application;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Hero greeting(@RequestParam(value="name", defaultValue="Mehmet") String name) {
        return new Hero(counter.incrementAndGet(),
                String.format(TEMPLATE, name));
    }
}
