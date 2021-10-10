package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class BankOfAmericaStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;


    public BankOfAmericaStepsDefinitions() {
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bankofamerica.com/");

    }

    @And("i go to home loans")
    public void click_home_loans() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Home Loans')]")).click();
        Thread.sleep(20000);

    }

    @Then("i should see Mortgages")
    public void is_mortgage_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Mortgages')]")).isDisplayed());
    }


    @Then("i should see Refinance")
    public void is_refinance_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Refinance')]")).isDisplayed());
    }

    @Then("i should see Home Equity")
    public void is_Home_Equity_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Home Equity')]")).isDisplayed());

    }
}


