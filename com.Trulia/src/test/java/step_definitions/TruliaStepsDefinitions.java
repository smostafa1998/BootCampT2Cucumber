package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.Homepage;
import pom.MortagesHomePage;


public class TruliaStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    MortagesHomePage mortages;


    public TruliaStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        mortages = new MortagesHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.trulia.com/");
    }

    @When("user goes to mortage page")
    public void userGoesToMortagePage() {
        homepage.navigateToMortagesPage();
    }

    @And("user clicks on the affordability calculator")
    public void userClicksOnTheAffordabilityCalculator() {
        clickOnElement(mortages.affordCalculator);
    }

    @And("user enters the {string} info for annual income")
    public void userEntersTheInfoForAnnualIncome(String annualIncomeInput) {
        addingKeyboardInput(mortages.annualIncomeInput,annualIncomeInput);
    }

    @And("user enters the {string} info for down payment")
    public void userEntersTheInfoForDownPayment(String downPaymentInput) {
        addingKeyboardInput(mortages.downPaymentInput,downPaymentInput);
    }

    @And("user enters the  {string} info for other debts")
    public void userEntersTheInfoForOtherDebts(String otherMonthlyDebts) {
        addingKeyboardInput(mortages.otherMonthlyDebts,otherMonthlyDebts);
    }

    @And("user enters their {string}")
    public void userEntersTheir(String zipCode) {
        addingKeyboardInput(mortages.zipCode,zipCode);
    }

    @Then("user finds {string}")
    public void userFinds(String searchResult) {
        Assert.assertEquals(mortages.affordHome.getText(), searchResult);
    }
}