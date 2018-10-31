package cucumber.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KnowledgeSteps {
    WebDriver driver = null;

    @Given("^Open de browser$")
    public void Open_de_browser() {
        driver = new ChromeDriver();
    }

    @When("^Open de tour of heroes$")
    public void goToTourOfHeroes() {
        driver.navigate().to("http://localhost:4200/dashboard");
    }

    @Then("^Iets zou bestaan$")
    public void loginButton() {
        if(driver.findElement(By.id("topHeroes")).isDisplayed()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}
