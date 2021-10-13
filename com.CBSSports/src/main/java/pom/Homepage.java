package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
        //clickOnElement(AcceptButton);
    }

    @FindBy(xpath="/html/body/div[7]//div[1]//div[2]//button")
    public WebElement AcceptButton;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[5]/a")
    public WebElement soccerLink;

//ul/li[9]/div/div/div[3]/div[2]/div/a


    /**
     * This is to navigate to the soccer collections page of cbsSports
     * @return
     */

    public SoccerHomePage navigateToSoccer(){
        clickOnElement(soccerLink);
        System.out.println("clicked");
        return new SoccerHomePage();
    }

    public SoccerHomePage hoverToSoccer(){
        hoverAction(soccerLink);
        return new SoccerHomePage();
    }
    public void enterUserInfo(WebElement email, String emailName, WebElement password, String passwordName){
        waitForElementToBeVisible(email);
        clickOnElement(email);
        sendKeysToInput(email,emailName);
        waitForElementToBeVisible(password);
        clickOnElement(password);
        sendKeysToInput(password,passwordName);
    }

    public void clickOnShopLink(WebElement link){
        waitForElementToBeVisible(link);
        clickOnElement(link);
    }

    public void pickASoccerTeam(WebElement hoverElement,String number){
        hoverAction(hoverElement);
        WebElement element = driver.findElement(By.xpath("//ul/li[9]/div/div/div[3]/div[2]/div/a"+"["+number+"]"));
        clickOnElement(element);
    }

    public void pickAProduct(String product_number){
        WebElement element = driver.findElement(By.xpath("//div"+"["+product_number+"]"+"/div/div[2]/div[3]/a"));
        clickOnElement(element);
    }


}