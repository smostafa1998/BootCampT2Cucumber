package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightsHomePage extends BaseClass {
    public FlightsHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the flight page
     */

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button[1]")
    public WebElement originLocation;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement originLocationText;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button")
    public WebElement firstResult;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
    public WebElement destinationLocation;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination\"]")
    public WebElement destinationLocationText;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button")
    public WebElement firstResult2;

    @FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    public WebElement searchButton;

    @FindBy(xpath="//*[@id=\"d1-btn\"]")
    public WebElement dateButton;

    @FindBy(xpath="//*[@data-stid=\"apply-date-picker\"]")
    public WebElement doneButton;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]/div/div[3]/div[1]/aside/fieldset/div/legend")
    public WebElement confirmRR;





}