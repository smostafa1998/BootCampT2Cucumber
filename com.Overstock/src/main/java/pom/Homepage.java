package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    // decor elements

    @FindBy(xpath="//*[@id=\"TopNav\"]/div[1]/div[3]/a")
    public WebElement decorTab;

    @FindBy(xpath="//*[@id=\"push_notifications_container\"]/div[4]/div[1]")
    public WebElement notification_no_thanks;

    @FindBy(xpath="//*[@id=\"push_notifications_container\"]/svg")
    public WebElement notification_close;

    @FindBy(xpath="//*[@id=\"notification_allow\"]")
    public WebElement notification_allow;

    /**
     * This is to navigate to the decor collections page of ebay
     * @return
     */
    public DecorHomePage navigateToDecor(){
        clickOnElement(decorTab);
        System.out.println("clicked");
        return new DecorHomePage();
    }

    public DecorHomePage hoverToDecor(){
        clickOnElement(decorTab);
        hoverAction(decorTab);
        return new DecorHomePage();
    }

    public void enterUserInfo(WebElement email, String emailName, WebElement password, String passwordName){
        waitForElementToBeVisible(email);
        clickOnElement(email);
        sendKeysToInput(email,emailName);
        waitForElementToBeVisible(password);
        clickOnElement(password);
        sendKeysToInput(password,passwordName);
    }

}
