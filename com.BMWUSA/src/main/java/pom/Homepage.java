package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[1]//div[2]/div[3]//ul/li[3]/button")
    public WebElement shoppingTab;

    public ShoppingHomePage navigateToShoppingPage(){
        clickOnElement(shoppingTab);
        System.out.println("clicked");
        return new ShoppingHomePage();
    }

}
