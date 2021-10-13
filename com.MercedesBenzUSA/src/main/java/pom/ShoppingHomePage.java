package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingHomePage extends BaseClass {

    public ShoppingHomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the shopping page
     */

    @FindBy(xpath = "//div[1]//ul/li[2]//div[1]/ul/li[1]//div[1]/ul/li[4]/a")
    public WebElement estimatePayment;

    @FindBy(xpath = "//*[@id=\"payment-estimator-navigation-tabs__item-by-budget\"]")
    public WebElement budgetTab;

    @FindBy(xpath = "//*[@id=\"monthlyPayment\"]")
    public WebElement monthlyPayment;

    @FindBy(xpath = "//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[1]//div[3]//button")
    public WebElement yearButton;

    @FindBy(xpath = "//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[1]//div[4]//button")
    public WebElement term;

    @FindBy(xpath = "//*[@id=\"downPayment\"]")
    public WebElement downPayment;

    @FindBy(xpath = "//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[2]/div/button")
    public WebElement submitButton;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[4]/p")
    public WebElement numOfvehicles;


}
