package testBase;

import base.BaseClass;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import pom.Homepage;
import pom.SoccerHomePage;

public class TestBase extends BaseClass {

    public Homepage getHomepage() {
        return new Homepage();
    }

    public SoccerHomePage getSoccerHomePage(){
        return new SoccerHomePage();
    }

    public boolean isElementPresent(WebElement element) {
        boolean flag = false;

        try {
            if (element.isDisplayed()) {
                flag = true;
            }
        } catch (ElementNotVisibleException e) {
            e.printStackTrace();
        }
        return flag;
    }

}