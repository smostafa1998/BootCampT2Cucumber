package step_definitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class EbayStepsDefinitions extends BaseClass {

    SharedStepsUI sharedStepsUI;


    public EbayStepsDefinitions() {
        sharedStepsUI = new SharedStepsUI();

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
    public void i_should_see_no_items_in_cart_message_displayed()  {
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
        if (driver.findElement(By.xpath("//*[@id='gh-shop-a']")).isDisplayed())

            return true;
        System.out.println("shopping page displayed");


        return false;
    }
}

