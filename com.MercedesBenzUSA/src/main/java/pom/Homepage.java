package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[1]/header/nav/div[2]/ul[1]/li[2]/button")
    public WebElement shoppingTab;


    public ShoppingHomePage navigateToShopping(){
        clickOnElement(shoppingTab);
        return new ShoppingHomePage();
    }

    public void pickTheYear(WebElement clickYear,String year){
        clickOnElement(clickYear);
        WebElement element = driver.findElement(By.xpath("//*[@data-value="+year+"]"));
        clickOnElement(element);
    }

    public void pickTheMonths(WebElement clickMonths,String months){
        clickOnElement(clickMonths);
        WebElement element = driver.findElement(By.xpath("//*[@data-value="+months+"]"));
        clickOnElement(element);
    }


}