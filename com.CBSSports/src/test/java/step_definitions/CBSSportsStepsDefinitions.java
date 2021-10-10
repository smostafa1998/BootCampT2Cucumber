package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class CBSSportsStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;


    public CBSSportsStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();

    }

    // STEPS DEFINITIONS GO IN HERE (i.e. A METHOD FOR EACH STEP OF THE SCENARIO)

    @Given("user is at homepage")
    public void userIsAtHomepage() {
        sharedStepsUI.openApplication();
    }

    @When("user enters the url")
    public void userEntersTheUrl() {
        System.out.println("Entering URL");
    }

    @Then("user navigates to the Homepage")
    public void userNavigatesToTheHomepage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.cbssports.com/");

    }
    @And("i want to login to my account")
    public void click_login() {
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
    }

    @And("i enter username and password")
    public void enter_username_password() {
        driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("otounsia@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("BootCamp@2021");

    }
    @And("i click login")
    public void click_log_in() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("i should see my team box is displayed")
    public void i_should_see_no_items_in_cart_message_displayed()  {
        if (driver.findElement(By.xpath("//span[contains(text(),'My Teams')]")).isDisplayed())

            //pass
            System.out.println("Page contains expected text");
            //Fail
        else {
            System.out.println("Page doesn't contains expected text");
        }
    }
    @And("i want to log off")
    public void log_off() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'My Teams')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
}
    @Then("i should navigate back to homepage")
    public void navigate_back_to_home_page()  {
        if (driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).isDisplayed())

            //pass
            System.out.println("navigated back to homepage was successful");
            //Fail
        else {
            System.out.println("navigated back to homepage was unsuccessful");
        }
    }}