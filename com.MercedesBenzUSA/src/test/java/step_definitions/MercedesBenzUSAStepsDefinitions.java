package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.Homepage;
import pom.ShoppingHomePage;


public class MercedesBenzUSAStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    ShoppingHomePage shopping;


    public MercedesBenzUSAStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        shopping= new ShoppingHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mbusa.com/");
    }

    @When("user enters the shopping page")
    public void userEntersTheShoppingPage() {
        homepage.navigateToShopping();
    }

    @And("user clicks on the estimate payment button")
    public void userClicksOnTheEstimatePaymentButton() {
        clickOnElement(shopping.estimatePayment);
    }

    @And("user clicks on the budget tab")
    public void userClicksOnTheBudgetTab() {
        clickOnElement(shopping.budgetTab);
    }

    @And("user enters in the {string} information")
    public void userEntersInTheInformation(String monthlyPayment) {
        addingKeyboardInput(shopping.monthlyPayment, monthlyPayment);
    }

    @And("user clicks on the {string} dropdown for the car year")
    public void userClicksOnTheDropdownForTheCarYear(String year) {
        homepage.pickTheYear(shopping.yearButton,year);
    }

    @And("user clicks on the {string} dropdown for the car")
    public void userClicksOnTheDropdownForTheCar(String months) {
        homepage.pickTheMonths(shopping.term,months);
    }

    @And("user enters the {string} information for the down payment")
    public void userEntersTheInformationForTheDownPayment(String downPayment) {
        addingKeyboardInput(shopping.downPayment, downPayment);
    }

    @And("user clicks on find vehicles")
    public void userClicksOnFindVehicles() {
        clickOnElement(shopping.submitButton);
    }

    @Then("user sees the results sheet for the cars with the {string}")
    public void userSeesTheResultsSheetForTheCarsWithThe(String num_of_vehicles) {
        waitForElementToBeVisible(shopping.numOfvehicles);
        Assert.assertEquals(shopping.numOfvehicles.getText(), num_of_vehicles);
    }
}