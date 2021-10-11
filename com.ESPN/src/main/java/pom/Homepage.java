package pom;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    /**
     * ESPN HOMEPAGE
     */
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * this is to navigate to the NFL page
     */
    @FindBy(xpath="//*[@id=\"global-nav\"]/ul/li[1]/a")
    public WebElement nfl;

    @FindBy(xpath="//*[@id=\"global-nav\"]/ul/li[1]/div/ul[1]/li[1]/a")
    public WebElement nfl2;


    public NFLHomePage navigateToNFLHomePage() {
        waitForElementToBeVisible(nfl);
        clickOnElement(nfl);
        clickOnElement(nfl2);
        return new NFLHomePage();
    }

    public void addingGroupNum(String groupNum){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"fitt-analytics\"]//div[2]/div/label"+"["+groupNum+"]"+"/div/div"));
        clickOnElement(element);
    }

    public void addingScoring(String scoring){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"fitt-analytics\"]//section/div/div/div[3]/div/label"+"["+scoring+"]"+"/div/div"));
        clickOnElement(element);
    }



}