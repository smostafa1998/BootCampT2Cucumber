package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/header/nav/ul/li[3]/a")
    public WebElement mortageTab;

    public MortagesHomePage navigateToMortagesPage(){
        clickOnElement(mortageTab);
        System.out.println("clicked");
        return new MortagesHomePage();
    }

    public void calculatorKeyboard(WebElement keyWord, String input){
        clickOnElement(keyWord);
        sendKeysToInput(keyWord,input);
    }

}
