package nl.jeremyvdveen.knowledgetool.application;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class RunCucumberTest {


    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"pretty"})
    public class RunCukesTest {
    }


}

