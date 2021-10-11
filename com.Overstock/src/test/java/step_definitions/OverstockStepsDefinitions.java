package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.DecorHomePage;
import pom.Homepage;


public class OverstockStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    DecorHomePage decor;


    public OverstockStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        decor = new DecorHomePage();
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.overstock.com/");
    }

    @When("user navigates to the decor page from homepage")
    public void userNavigatesToTheDecorPageFromHomepage() {
        homepage.hoverToDecor();
    }

    @And("user clicks on the decor advice page")
    public void userClicksOnTheDecorAdvicePage() {
        clickOnElement(decor.DecorAdvice);
    }

    @And("user sends a {string} to the search bar")
    public void userSendsAToTheSearchBar(String search_term) {
        sendKeysToInput(decor.searchInput, search_term);
    }

    @And("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        clickOnElement(decor.buttonSubmit);
    }

    @And("user clicks on the first article on the page")
    public void userClicksOnTheFirstArticleOnThePage() {
        clickOnElement(decor.firstArticle);
    }

    @Then("user checks if {string} of the article is asserted")
    public void userChecksIfOfTheArticleIsAsserted(String title) {
        Assert.assertEquals(decor.grabArticleTitle.getText(), title);
    }

    @And("user clicks on account buttons")
    public void userClicksOnAccountButtons() {
        clickOnElement(decor.inputAccount);
        foundIframe(decor.loginIframe);
    }

    @And("user sends a {string} to the email bar")
    public void userSendsAToTheEmailBar(String email) {
        homepage.enterEmail(decor.inputEmail,email);
    }

    @And("user sends a {string} to the password bar")
    public void userSendsAToThePasswordBar(String password) {
        homepage.enterPassword(decor.inputPassword,password);
    }

    @Then("user clicks to sign in but fails")
    public void userClicksToSignInButFails() {
        clickOnElement(decor.submitButton);
        waitForElementToBeVisible(decor.registerErrorMessage);
        Assert.assertEquals(decor.registerErrorMessage.getText(),"There was an error, please try again.");
    }
}