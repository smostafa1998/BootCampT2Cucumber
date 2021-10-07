package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuyHousesHomePage extends BaseClass {

    public BuyHousesHomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the redfin page
     */

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[1]//div[2]/div/span[1]/span/span")
    public WebElement clickButton;

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[2]//span[1]//div[1]//div[4]")
    public WebElement minPrice;

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[2]//span[2]/span/span")
    public WebElement clickButton2;

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[1]//div[2]//span[2]/span/span//div[8]")
    public WebElement maxPrice;

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[2]//div[3]/button")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"sidepane-header\"]/div/div[3]/button[2]")
    public WebElement checkTable;

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[2]//div/form/div[1]/div/input")
    public WebElement sendKeysToInput;

    @FindBy(xpath = "//*[@id=\"right-container\"]//div[1]/div[2]//div[1]//form/div[3]/div[1]//div[2]")
    public WebElement firstLocationPick;

    @FindBy(xpath = "//*[@id=\"results-display\"]/div[1]//h1")
    public WebElement getSaleName;

    @FindBy(xpath="//*[contains(@id,\"ReactDataTableRow_\")]/td[2]/div/a")
    public List<WebElement> listAdresses;


}
