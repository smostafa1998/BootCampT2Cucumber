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

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    public WebElement artCollection;

    //////these go together///////////

    @FindBy (xpath = "//*[@id=\"gh-shop-a\"]")
    public WebElement categoryButton;

    @FindBy (xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[1]/a")
    public WebElement artCollection2;

    //////////these go together///////

    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[6]")
    public WebElement hoverArtCollection;

    /**
     * This is to navigate to the art collections page of ebay
     * @return
     */
    public ArtCollectionHomePage navigateToArtCollection(){
        clickOnElement(artCollection);
        System.out.println("clicked");
        return new ArtCollectionHomePage();
    }

    public ArtCollectionHomePage navigateToArtCollection2(){
        clickOnElement(categoryButton);
        clickOnElement(artCollection2);
        return new ArtCollectionHomePage();
    }

    public ArtCollectionHomePage hoverToArt(){
        hoverAction(hoverArtCollection);
        return new ArtCollectionHomePage();
    }

    public void clickOnCondition(WebElement clickBox,String condition){
        clickOnElement(clickBox);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[0]-34-menuList-optionsText\"]/li"+"["+condition+"]"+"/button"));
        clickOnElement(element);
    }

    public void clickOnPublisher(String publisher){
        //clickOnElement(clickBox);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[1]-36-menuList-optionsText\"]/li"+"["+publisher+"]"+"/button"));
        waitForElementToBeVisible(element);
    }

    public void clickOnGame(WebElement clickBox,String game){
        clickOnElement(clickBox);
        WebElement element = driver.findElement(By.xpath("//*[@data-value="+game+"]"));
        clickOnElement(element);
    }

    public void clickOnPlatform(WebElement clickBox,String platform){
        clickOnElement(clickBox);
        WebElement element = driver.findElement(By.xpath("//*[@data-value="+platform+"]"));
        clickOnElement(element);
    }

    public void clickOnGenre(WebElement clickBox,String genre){
        clickOnElement(clickBox);
        WebElement element = driver.findElement(By.xpath("//*[@data-value="+genre+"]"));
        clickOnElement(element);
    }

}
