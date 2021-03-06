package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
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
    public void userNavigatesToTheHomepage() throws InterruptedException {
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

    @And("i select car")
    public void select_one_way() throws InterruptedException {
        driver.findElement(By.xpath("//a/span[contains(text(),'Cars']")).click();
        Thread.sleep(20000);

    }

    @And("i enter the pick up location")
    public void enter_pick_up_from() {
        driver.findElement(By.xpath("//input[@id='location-field-loc2-input']")).sendKeys("RDU");
        driver.findElement(By.xpath("//*[contains(text(),'Raleigh (RDU - Raleigh-Durham Intl.')]")).click();
    }

    @And("i enter the drop off location")
    public void enter_drop_off_from() {
        driver.findElement(By.xpath("//input[@id='location-field-loc2-input']")).sendKeys("Cary");
        driver.findElement(By.xpath("//*[contains(text(),'Cary, North Carolina, United States')]")).click();
    }

    @And("i select pick up date and drop off date")
    public void select_date() {
        driver.findElement(By.xpath("//select[@aria-label='Pick-up date']")).click();

        driver.findElement(By.xpath("//button[@aria-label='Nov 16, 2021']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Nov 26, 2021']")).click();
    }

    @And("i click done to confirm date")
    public void click_done() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Done')]")).click();
        Thread.sleep(10000);

    }
    @And("i select pick up time")
    public void select_pick_up_time_from_drop_down() {
        driver.findElement(By.xpath("//select[@aria-label='Pick-up time']")).click();

        driver.findElement(By.xpath("//option[@value='1200AM']")).click();


    }
    @And("i select drop off time")
    public void select_drop_off_time_from_drop_down() {
        driver.findElement(By.xpath("//select[@aria-label='Drop-off time']")).click();

        driver.findElement(By.xpath("//option[@value='0215AM']")).click();


    }
    @And("i click search")
    public void click_search() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Search')]")).click();
        Thread.sleep(10000);

    }
}
