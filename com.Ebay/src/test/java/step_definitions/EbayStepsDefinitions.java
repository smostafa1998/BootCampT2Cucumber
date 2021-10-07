package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        artCollection = homepage.navigateToArtCollection();
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

}