package zdtestpol51bdd.devto;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DevToStepsDefinitions {

    WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }

    @Given("Chrome browser in open")
    public void chrome_browser_in_open() {
        driver = new ChromeDriver();
    }
    @When("I go de devto main page")
    public void i_go_de_devto_main_page() {
        driver.get("https://dev.to");
    }
    @When("I clic on first blog displayed")
    public void i_clic_on_first_blog_displayed() {

    }
    @Then("I should be redirected to blog page")
    public void i_should_be_redirected_to_blog_page() {

    }

}
