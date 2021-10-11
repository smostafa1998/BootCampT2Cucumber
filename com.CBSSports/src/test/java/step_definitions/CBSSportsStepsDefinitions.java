package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.Homepage;
import pom.SoccerHomePage;


public class CBSSportsStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    SoccerHomePage soccer;


    public CBSSportsStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        soccer = new SoccerHomePage();

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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.cbssports.com/");
    }

    @When("user navigates to the soccer page from homepage")
    public void userNavigatesToTheSoccerPageFromHomepage() {
        homepage.navigateToSoccer();
    }

    @And("user clicks on the dot dot dot button")
    public void userClicksOnTheDotDotDotButton() {
        hoverAction(soccer.dotdotdotButton);
    }


    @And("user clicks on the shop link soccer button")
    public void userClicksOnTheShopLinkSoccerButton() {
       homepage.clickOnShopLink(soccer.shopLink);
    }

    @And("user picks on one of the {string} links")
    public void userPicksOnOneOfTheLinks(String soccer_number) {
        homepage.pickASoccerTeam(soccer.shopSoccer,soccer_number);
    }

    @And("user clicks on one of the {string}")
    public void userClicksOnOneOfThe(String product_number) {
        homepage.pickAProduct(product_number);
    }

    @Then("user will find the {string} from that soccer team")
    public void userWillFindTheFromThatSoccerTeam(String itemName) {
        waitForElementToBeVisible(soccer.productName);
        Assert.assertEquals(soccer.productName.getText(), itemName);
    }
}