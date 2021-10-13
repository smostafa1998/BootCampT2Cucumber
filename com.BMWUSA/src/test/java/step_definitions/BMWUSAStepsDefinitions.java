package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pom.Homepage;
import pom.ShoppingHomePage;


public class BMWUSAStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    ShoppingHomePage shopping;


    public BMWUSAStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        shopping = new ShoppingHomePage();
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
    public void userNavigatesToTheHomepage() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bmwusa.com/");
    }
  
    @When("user navigates to the the shopping tab")
    public void userNavigatesToTheTheShoppingTab() {
        homepage.navigateToShoppingPage();
    }

    @And("user clicks on the estimate payment button")
    public void userClicksOnTheEstimatePaymentButton() {
        clickOnElement(shopping.estimateButton);
    }

    @And("user selects from the dropdown menu for {string}")
    public void userSelectsFromTheDropdownMenuFor(String car_series) {
        clickOnElement(shopping.series);
        dropdownSelectByValue(shopping.series, car_series);
    }

    @And("user selects from the dropdown menu and picks {string}")
    public void userSelectsFromTheDropdownMenuAndPicks(String car_model) {
        clickOnElement(shopping.model);
        dropdownSelectByValue(shopping.model, car_model);
    }

    @And("users enters in their {string}")
    public void usersEntersInTheir(String zipCode) {
        addingKeyboardInput(shopping.inputZIP, zipCode);
    }

    @And("user clicks on the estimate button to see")
    public void userClicksOnTheEstimateButtonToSee() {
        clickOnElement(shopping.estimatePayments);
    }

    @Then("user receives the {string} of the car")
    public void userReceivesTheOfTheCar(String year) {
        waitForElementToBeVisible(shopping.confirmYear);
        Assert.assertEquals(shopping.confirmYear.getText(), year);
    }

    @And("i want to build my own")
    public void click_build_my_own() throws InterruptedException {
        driver.findElement(By.xpath("//li/a[contains(text(),'Build Your Own')]")).click();
        Thread.sleep(5000);
    }

    @Then("i should navigate building page")
    public void navigate_to_home_page() throws InterruptedException {
        driver.findElement(By.xpath("//h1[@class='series-header-title headline-3 uppercase']")).isDisplayed();
        Thread.sleep(5000);
    }

    @And("i want select vehicle type")
    public void select_type() throws InterruptedException {
        driver.findElement(By.xpath("//a[@title='X1 Sports Activity Vehicle']")).click();
        Thread.sleep(5000);
    }

    @Then("i navigate to the selected vehicle page")
    public void navigate_selected_vehicle_page() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'X1 Sports Activity Vehicle')]")).isDisplayed();
        Thread.sleep(5000);
    }

    @And("i want select vehicle model")
    public void select_model() throws InterruptedException {
        driver.findElement(By.xpath("//img[@alt='2021 BMW X1 xDrive28i']")).click();
        Thread.sleep(5000);
    }

    @And("i go to summary")
    public void click_summary() throws InterruptedException {
        driver.findElement(By.xpath("//li/a[contains(text(),'Summary')]")).click();
        Thread.sleep(5000);
    }

    @And("i click get your quote")
    public void click_quote() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Get Your Quote')]")).click();
        Thread.sleep(20000);
    }

    @Then("i navigate to the driver information page")
    public void navigate_driver_info_page() throws InterruptedException {
        driver.findElement(By.xpath("//h1[contains(text(),'Experience the ease of online shopping.')]")).isDisplayed();
        Thread.sleep(20000);
    }

}