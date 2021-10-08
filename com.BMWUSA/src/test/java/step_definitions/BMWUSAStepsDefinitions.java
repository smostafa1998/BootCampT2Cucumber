package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void userNavigatesToTheHomepage() {
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


}