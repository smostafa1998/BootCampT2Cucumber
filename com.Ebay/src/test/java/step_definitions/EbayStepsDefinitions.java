package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;

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


    @And("search for women clothing")
    public void enter_in_search_box() {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Women clothing");
    }

    @And("click on search box")
    public void click_search_box() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(10000);
    }

    @And("i should  see women cloth displayed in home page")
    public void women_clothes_should_be_displayed() throws InterruptedException {

        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='BOLD']")).isDisplayed());
        Thread.sleep(10000);

    }

    @And("i select dresses")
    public void select_dresses() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Dresses')]")).click();
        Thread.sleep(10000);

    }

    @And("i click cart")
    public void click_cart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='gh-cart-icon']")).click();
        Thread.sleep(10000);

    }

    @Then("i should see no items in cart message displayed")
    public void i_should_see_no_items_in_cart_message_displayed() {
        if (driver.findElement(By.xpath("//div[@class='font-title-3']")).isDisplayed())

            //pass
            System.out.println("Page contains expected text");
            //Fail
        else {
            System.out.println("Page doesn't contains expected text");
        }
    }

    @And("i click start shopping")
    public void click_start_shopping() {
        driver.findElement(By.xpath("//a[@class='start-shop btn btn--faux']")).click();

    }

    @Then("i should navigate back to shopping page")
    public Boolean is_shopping_page_displayed() {
        if (driver.findElement(By.xpath("//*[@id='gh-shop-a']")).isDisplayed()) {
            return true;
        }
        System.out.println("shopping page displayed");
        return false;
    }

    @And("user clicks on the {string} brand name")
    public void userClicksOnTheBrandName(String publisher) {
        clickOnElement(artCollection.B);
        //sendKeysToInput(artCollection.Binput,"Nintendo");
        artCollection.Binput.sendKeys("Nintendo", Keys.ARROW_DOWN, Keys.RETURN);
    }


    @And("user then clicks on the {string} game name")
    public void userThenClicksOnTheGameName(String game_name) {
        clickOnElement(artCollection.C);
        sendKeysToInput(artCollection.Cinput, "Wii Sports");
        artCollection.Cinput.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
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
