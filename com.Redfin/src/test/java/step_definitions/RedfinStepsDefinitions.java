package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.BuyHousesHomePage;
import pom.Homepage;


public class RedfinStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    BuyHousesHomePage houses;


    public RedfinStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        houses = new BuyHousesHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.redfin.com/");

    }

    @When("user goes to buy page")
    public void userGoesToBuyPage() {
        homepage.navigateToBuy();
    }

    @And("user adds the {string}")
    public void userAddsThe(String location) {
        homepage.sendKeywordLocation(houses.sendKeysToInput, location, houses.firstLocationPick);
    }
    @And("user adds the {string} for low price Range")
    public void userAddsTheForLowPriceRange(String lowPrice) {
        homepage.clickOnMinRange(houses.clickButton,lowPrice);
    }

    @And("user adds the {string} for high price Range")
    public void userAddsTheForHighPriceRange(String highPrice) {
        homepage.clickOnMaxRange(houses.clickButton2,highPrice);
    }

    @And("user clicks the search button")
    public void userClicksTheSearchButton() {
        clickOnElement(houses.searchButton);
    }

    @And("user reaches the website results where user clicks on table view")
    public void userReachesTheWebsiteResultsWhereUserClicksOnTableView() {
        clickOnElement(houses.checkTable);
    }

    @Then("user finds the sale name which matches the predefined {string}")
    public void userFindsTheSaleNameWhichMatchesThePredefined(String saleName) {
        Assert.assertEquals(houses.getSaleName.getText(), saleName);
    }



}
