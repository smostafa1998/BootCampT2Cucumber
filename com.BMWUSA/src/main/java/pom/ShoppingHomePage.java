package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingHomePage extends BaseClass {

    public ShoppingHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the shopping page
     */
    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/div")
    public WebElement shoppingText;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/ul/li/a")
    public List<WebElement> shoppingLinks;

    @FindBy(xpath="//*[@id=\"zip_code\"]")
    public WebElement zipCode;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[1]/form/button[1]")
    public WebElement shopNew;

    @FindBy(xpath="//*[@id=\"scroll-top-target\"]/div[2]/div/div[2]/div[4]/div[1]")
    public List<WebElement> pricesNewCars;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/ul/li[2]/a")
    public WebElement estimateButton;

    @FindBy(xpath="//*[@id=\"series\"]")
    public WebElement series;

    @FindBy(xpath="//div[2]/div[1]//div[1]//div[1]/div[2]/div[2]/label[2]/div[3]/select")
    public WebElement model;

    @FindBy(xpath="//div[2]/div[1]//div[1]//div[1]/div[2]/div[2]/label[3]/div[3]/input")
    public WebElement inputZIP;

    @FindBy(xpath="//div[2]/div[1]//div[2]/div[2]/div[2]/button")
    public WebElement estimatePayments;

    @FindBy(xpath=" //*[@class=\"pe-payment-options-card__finance sub-panel\"]/h4/span[1]")
    public WebElement priceOfCar;


    @FindBy(xpath="//div[2]/div[1]//div[1]//section/div[1]/div[3]/div[2]/div[1]/p")
    public WebElement confirmYear;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/ul/li[4]/a")
    public WebElement shopPartsTab;

    @FindBy(xpath="//*[@id=\"divTopCategories\"]/div/div/a/div/p")
    public List<WebElement> listAccessories;

    @FindBy(xpath="//*[@id=\"divTopCategories\"]/div[3]/div/a")
    public WebElement bmwApparel;

    @FindBy(xpath="//*[@id=\"btnSort\"]")
    public WebElement buttonSort;

    @FindBy(xpath="//*[@id=\"description2\"]/div/ul/li[4]/a")
    public WebElement lowTohigh;

    @FindBy(xpath="//*[@id=\"accordian\"]/div[2]/div/div[1]//div[3]//a")
    public WebElement apparalTab;

    @FindBy(xpath="//*[@id=\"accordian\"]/div[2]//div[1]//div[3]//a")
    public WebElement kidTab;

    @FindBy(xpath = "//*[@id=\"divPrdListMain\"]/div/div[3]/div/div/div[2]/a")
    public List<WebElement> kidItems;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[2]/ul/li[1]/a")
    public WebElement leaseAndFinancing;

    @FindBy(xpath="//div[2]/div[1]//div[3]/div/bmw-template-switch//form/div[1]/div[1]//input")
    public WebElement zipCodeInput;

    @FindBy(xpath="//div[2]/div[1]//div[3]//bmw-template-switch//div[2]/div/select")
    public WebElement vehicleSelect;

    @FindBy(xpath="//div[2]/div[1]//div[3]//bmw-template-switch//form/div[4]/div/select")
    public WebElement yearsSelect;

    @FindBy(xpath="//div[3]//bmw-template-switch[2]//ul/li[2]/div/div[1]/div[1]/div")
    public WebElement moreInfo;

    @FindBy(xpath="//div[2]//div[3]//bmw-template-switch[2]//ul/li[2]/div//div[2]/div[1]/ul/li")
    public List<WebElement> infoList;

}
