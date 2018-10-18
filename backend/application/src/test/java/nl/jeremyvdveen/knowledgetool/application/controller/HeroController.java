package nl.jeremyvdveen.knowledgetool.application.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import io.restassured.RestAssured;

@RestController
public class HeroController {
    @Value("${local.server.port}")
    private int localServerPort;

    @Before
    public void setup() {
        RestAssured.port = 8090;
    }

    @Test
    public void greetingReturnStatus200AndHasValidBody() {
        given().when().get("/greeting").then().statusCode(200).assertThat().body("content", equalTo("Hello, Mehmet!"));
    }
}
