package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * EXPEDIA HOMEPAGE
 */
public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"wizardMainRegionV2\"]//div[2]//ul/li[2]/a")
    public WebElement flightsLink;

    public FlightsHomePage navigateToFlight() {
        clickOnElement(flightsLink);
        return new FlightsHomePage();
    }

    public void setUpLocations(WebElement location, WebElement locationText, String text, WebElement firstResult) {
        clickOnElement(location);
        sendKeysToInput(locationText, text);
        clickOnElement(firstResult);
    }


    public void selectBox(WebElement input) {
        clickOnElement(input);
        webDriverWait.until(ExpectedConditions.elementSelectionStateToBe(input, true));
    }

    public void unselectBox(WebElement input) {
        clickOnElement(input);
        webDriverWait.until(ExpectedConditions.elementSelectionStateToBe(input, false));
    }

    public void clickStartDate(WebElement date, String startingDate) {
        clickOnElement(date);
        WebElement element = driver.findElement(By.xpath("//*[@aria-label=\"" + startingDate + "\"]"));
        clickOnElement(element);
    }

    public void clickEndDate(WebElement done, String endingDate) {
        WebElement element = driver.findElement(By.xpath("//*[@aria-label=\"" + endingDate + "\"]"));
        clickOnElement(element);
        clickOnElement(done);
    }

}