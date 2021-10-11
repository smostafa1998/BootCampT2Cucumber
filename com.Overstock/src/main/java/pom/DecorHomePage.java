package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DecorHomePage extends BaseClass {

    public DecorHomePage(){
        PageFactory.initElements(driver,this);
    }


    /**
     * Put all elements under here for the decor page
     */

    @FindBy(xpath="//*[@id=\"TopNav\"]/div[1]/div[3]//div[8]/a[4]")
    public WebElement DecorAdvice;

    @FindBy(xpath="//*[@id=\"wp-post-search\"]")
    public WebElement searchInput;

    @FindBy(xpath="//*[@class=\"search-submit\"]")
    public WebElement buttonSubmit;

    @FindBy(xpath="//*[@id=\"bd\"]/div[2]/div/div[1]/article/div[2]/h3/a")
    public WebElement firstArticle;

    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/h1")
    public WebElement grabArticleTitle;


}