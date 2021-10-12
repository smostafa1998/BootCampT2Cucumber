package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pom.ArtCollectionHomePage;
import pom.Homepage;


public class EbayStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    ArtCollectionHomePage artCollection;


    public EbayStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        artCollection = new ArtCollectionHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
    }

    @When("user clicks on ArtCollection button")
    public void userClicksOnArtCollectionButton() {
        homepage.navigateToArtCollection();
    }

    @And("user enters a {string} in the search Bar")
    public void userEntersAInTheSearchBar(String searchTerm) {
        sharedStepsUI.sendKeysToSearchBox(searchTerm);
    }

    @And("user selects a {string} from the All categories")
    public void userSelectsAFromTheAllCategories(String category) {
        sharedStepsUI.selectCategoryByValue(category);
    }

    @And("user clicks the search button")
    public void userClicksTheSearchButton() {
        sharedStepsUI.clickSearchBox();
    }

    @Then("user is shown results in the art page and {string} is shown")
    public void userIsShownResultsInTheArtPageAndIsShown(String searchTerm) {
        Assert.assertEquals(artCollection.searchTerm.getText().toLowerCase(), searchTerm.toLowerCase());
    }


    @When("user clicks on ArtCollection the other way")
    public void userClicksOnArtCollectionTheOtherWay() {
        homepage.navigateToArtCollection2();
    }

    @And("user clicks on the sell something button")
    public void userClicksOnTheSellSomethingButton() {
        clickOnElement(artCollection.sellSomething);
    }

    @And("user clicks on the popular featured button")
    public void userClicksOnThePopularFeaturedButton() {
        clickOnElement(artCollection.popularFeaturedButton);
    }

    @And("user selects a video game from the category list")
    public void userSelectsAVideoGameFromTheCategoryList() {
        clickOnElement(artCollection.videoCategory);
    }

    @And("user clicks on the {string} state")
    public void userClicksOnTheState(String condition) {
        homepage.clickOnCondition(artCollection.A, condition);
    }


    @And("user clicks on the {string} brand name")
    public void userClicksOnTheBrandName(String publisher) {
        clickOnElement(artCollection.B);
        //sendKeysToInput(artCollection.Binput,"Nintendo");
        artCollection.Binput.sendKeys("Nintendo",Keys.ARROW_DOWN, Keys.RETURN);
    }


    @And("user then clicks on the {string} game name")
    public void userThenClicksOnTheGameName(String game_name) {
        clickOnElement(artCollection.C);
        sendKeysToInput(artCollection.Cinput,"Wii Sports");
        artCollection.Cinput.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
        //homepage.clickOnGame(artCollection.modelBox, game_name);
    }


    @And("user then clicks on the {string} platform name")
    public void userThenClicksOnThePlatformName(String platform) {
        homepage.clickOnPlatform(artCollection.platformBox, platform);
    }

    @And("user then clicks on the {string} genre name")
    public void userThenClicksOnTheGenreName(String genre) {
        homepage.clickOnGenre(artCollection.regionBox, genre);
    }

    @When("user clicks on ArtCollection the hover way")
    public void userClicksOnArtCollectionTheHoverWay() {
        homepage.hoverToArt();
    }

    @And("user clicks on one of the {string}")
    public void userClicksOnOneOfThe(String category) {
        homepage.clickOnCategory(category);
    }

    @And("user then clicks on one of the categories {string}")
    public void userThenClicksOnOneOfTheCategories(String topic) {
        homepage.clickOnTopic(topic);
    }

    @Then("user asserts the {string}")
    public void userAssertsThe(String title) {
        Assert.assertEquals(driver.getCurrentUrl(), title);
    }


}