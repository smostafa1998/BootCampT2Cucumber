package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.FlightsHomePage;
import pom.Homepage;


public class ExpediaStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    FlightsHomePage flights;

    public ExpediaStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        flights = new FlightsHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.expedia.com/");
    }

    @And("user navigates from the home page to the flight page")
    public void userNavigatesFromTheHomePageToTheFlightPage() {
        homepage.navigateToFlight();
    }

    @And("user enters the {string} location to the origin flight bar")
    public void userEntersTheLocationToTheOriginFlightBar(String origin) {
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,origin,flights.firstResult);
    }

    @And("user enters the {string} location to the destination flight bar")
    public void userEntersTheLocationToTheDestinationFlightBar(String destination) {
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,destination,flights.firstResult2);
    }

    @And("user enters the {string} to the starting date bar")
    public void userEntersTheToTheStartingDateBar(String startingDate) {
        homepage.clickStartDate(flights.dateButton,startingDate);
    }

    @And("user enters the {string} to the ending date bar")
    public void userEntersTheToTheEndingDateBar(String endingDate) {
        homepage.clickEndDate(flights.doneButton,endingDate);
    }

    @And("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        clickOnElement(flights.searchButton);
    }

    @Then("user confirms on the first flight")
    public void userConfirmsOnTheFirstFlight() {
        Assert.assertEquals(flights.confirmRR.getText(), "Filter by");
    }

}