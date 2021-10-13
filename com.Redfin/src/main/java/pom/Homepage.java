package pom;


import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"header-content\"]/header[2]/div[2]/div[2]/a")
    public WebElement buyHouse;

    public BuyHousesHomePage navigateToBuy() {
        clickOnElement(buyHouse);
        System.out.println("clicked");
        return new BuyHousesHomePage();
    }

    public BuyHousesHomePage hoverToBuy() {
        hoverAction(buyHouse);
        return new BuyHousesHomePage();
    }

    public void doPriceRanges(WebElement click, WebElement minPrice, WebElement click2, WebElement maxPrice) {
        clickOnElement(click);
        clickOnElement(minPrice);
        clickOnElement(click2);
        clickOnElement(maxPrice);
    }

    public void clearSearch(WebElement searchButtonLocation, WebElement clearButton) {
        clickOnElement(searchButtonLocation);
        clickOnElement(clearButton);
    }

    public void sendKeywordLocation(WebElement keywordSearch, String location, WebElement firstChoice) {
        addingKeyboardInput(keywordSearch, location);
        clickOnElement(firstChoice);
    }


    public void clickOnMinRange(WebElement clickButton, String price) {
        clickOnElement(clickButton);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"right-container\"]//span[1]/span/span/div/div/div/*[@aria-label=\"" + price + "\"]"));
        clickOnElement(element);
    }


    public void clickOnMaxRange(WebElement clickButton, String price) {
        clickOnElement(clickButton);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"right-container\"]//span[2]/span/span/div/div/div/*[@aria-label=\"" + price + "\"]"));
        clickOnElement(element);
    }


}
