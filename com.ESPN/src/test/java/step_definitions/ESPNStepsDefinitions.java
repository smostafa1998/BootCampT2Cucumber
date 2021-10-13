package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.Homepage;
import pom.NFLHomePage;


public class ESPNStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    NFLHomePage nflHomePage;


    public ESPNStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        nflHomePage = new NFLHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.espn.com/");
    }

    @When("user navigates to the nfl page from homepage")
    public void userNavigatesToTheNflPageFromHomepage() {
        homepage.navigateToNFLHomePage();
    }

    @And("user clicks on the fantasy football link")
    public void userClicksOnTheFantasyFootballLink() {
        clickOnElement(nflHomePage.fantasyFootball);
        hoverAction(nflHomePage.fantasyLink);
        clickOnElement(nflHomePage.fantasyBasketball);
    }

    @And("user clicks on the create League tab")
    public void userClicksOnTheCreateLeagueTab() {
        clickOnElement(nflHomePage.addLeagueBasketball);
    }

    @And("user sends {string} to League Name")
    public void userSendsToLeagueName(String input_team) {
        addingKeyboardInput(nflHomePage.inputTitle, input_team);
    }

    @And("user sends {string} to Group Number")
    public void userSendsToGroupNumber(String group_num) {
        homepage.addingGroupNum(group_num);
    }

    @And("user sends {string} to Scoring Type")
    public void userSendsToScoringType(String scoring) {
        homepage.addingScoring(scoring);
    }

    @And("user clicks on the create league button")
    public void userClicksOnTheCreateLeagueButton() {
        clickOnElement(nflHomePage.createLeagueButton);
    }

    @And("user sends {string} to the email bar")
    public void userSendsToTheEmailBar(String email) {
        foundIframe(nflHomePage.iframe);
        addingKeyboardInput(nflHomePage.email, email);
    }

    @And("user sends {string} to the password bar")
    public void userSendsToThePasswordBar(String password) {
        addingKeyboardInput(nflHomePage.password, password);
    }

    @And("user clicks on the log in")
    public void userClicksOnTheLogIn() {
        clickOnElement(nflHomePage.submit);
    }

    @Then("user tries to log in but gets error message")
    public void userTriesToLogInButGetsErrorMessage() {
        waitForElementToBeVisible(nflHomePage.errorMessage);
        Assert.assertEquals(nflHomePage.errorMessage.getText(), "The credentials you entered are incorrect.\n" +
                "Reminder: Passwords are case sensitive.");
    }
}