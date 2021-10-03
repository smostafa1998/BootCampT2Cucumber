package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//*[@id=\"site-content\"]//div[1]//header//div[2]//form//a/div")
    public WebElement onlineExperience;


    /**
     * This is to navigate to the online experiences
     */

    /*
    public OnlineExperiencesHomePage navigateToOnlineExperiences(){
        clickOnElement(onlineExperience);
        System.out.println("clicked");
        return new OnlineExperiencesHomePage();
    }

     */


}
