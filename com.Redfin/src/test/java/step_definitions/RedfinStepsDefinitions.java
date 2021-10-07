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
        homepage.sendKeywordLocation(houses.sendKeysToInput,location,houses.firstLocationPick);
    }

    @And("user adds the lowPrice Range for lowPrice")
    public void userAddsTheLowPriceRangeForLowPrice() {
        buttonSelect(houses.clickButton, houses.minPrice);
    }

    @And("user adds the highPrice Range for highPrice")
    public void userAddsTheHighPriceRangeForHighPrice() {
        buttonSelect(houses.clickButton2, houses.maxPrice);
    }

    @And("user clicks the search button")
    public void userClicksTheSearchButton() {
        clickOnElement(houses.searchButton);
    }

    @Then("user finds search results")
    public void userFindsSearchResults() {
    }

}