package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
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

    @And("i want to login to my account")
    public void click_login() {
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
    }

    @And("i enter username and password")
    public void enter_username_password() {
        driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("otounsia@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("BootCamp@2021");

    }

    @And("i click login")
    public void click_log_in() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("i should see my team box is displayed")
    public void i_should_see_no_items_in_cart_message_displayed() {
        if (driver.findElement(By.xpath("//span[contains(text(),'My Teams')]")).isDisplayed()) {
            System.out.println("Page contains expected text");
            //Fail
        } else {
            System.out.println("Page doesn't contains expected text");
        }
    }


    @And("i want to log off")
    public void log_off() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'My Teams')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
    }

    @Then("i should navigate back to homepage")
    public void navigate_back_to_home_page() {
        if (driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).isDisplayed()) {
            System.out.println("navigated back to homepage was successful");
        } else {
            System.out.println("navigated back to homepage was unsuccessful");
        }
    }


    @And("user picks on one of the {string} links")
    public void userPicksOnOneOfTheLinks(String soccer_number) {
        homepage.pickASoccerTeam(soccer.shopSoccer, soccer_number);
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
