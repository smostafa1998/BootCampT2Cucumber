package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SoccerHomePage extends BaseClass {
    public SoccerHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the soccer page
     */

    @FindBy(xpath="//*[@id=\"Newsletter\"]/div[1]/div[1]/div/h3")
    public WebElement soccerNewsLabel;

    @FindBy(xpath="//*[@id=\"page-content\"]/div[1]/div[2]/ul/li/a/h3")
    public List<WebElement> linksArticles;

    @FindBy(xpath="//*[@id=\"Newsletter\"]/div[1]/form/input[8]")
    public WebElement emailInput;

    @FindBy(xpath="//*[@id=\"Newsletter\"]/div[1]/form/input[9]")
    public WebElement submitButton;

    @FindBy(xpath="//*[@id=\"Newsletter\"]/div[2]")
    public WebElement errorMessage;

    @FindBy(xpath="//*[@id=\"CheckButton-checkbox\"]")
    public WebElement checkboxSub;

    @FindBy(xpath="//*[contains(@id,\"uid-\")]/ul[1]/li[1]/h5/a")
    public WebElement articleButton;

    @FindBy(xpath="//*[@id=\"article0\"]/article/div[3]/h2")
    public WebElement headlineText;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[10]")
    public WebElement dotdotdotButton;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[10]/ul/li[8]/a")
    public WebElement shopLink;

    @FindBy(xpath="//div[2]//header/div[3]/nav/ul/li[9]")
    public WebElement shopSoccer;

    @FindBy(xpath="//div[2]//div[3]//li[9]//div[3]/div[2]//a[8]")
    public WebElement irishLink;

    @FindBy(xpath="//*[@id=\"sort-by\"]")
    public WebElement sortBy;

    @FindBy(xpath="//*[@id=\"side-nav\"]//div[6]/div[2]/ul/li[3]")
    public WebElement radioButton;

    @FindBy(xpath="//div[2]//div[7]/div[2]/div[5]//div[2]/div/div/div[2]/div/a")
    public List<WebElement> listOfHats;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[2]/a")
    public WebElement championsLeague;

    @FindBy(xpath="//*[@id=\"Dropdown-selectedText\"]")
    public WebElement dropDownSelect;

    @FindBy(xpath="//*[@id=\"Dropdown-1\"]/div/ul/li[4]/a")
    public WebElement nationalWomen;

    @FindBy(xpath="//*[@id=\"mantle_skin\"]//div[3]/ul/li[4]/a")
    public WebElement standings;

    @FindBy(xpath="//*[@id=\"TableBase-1\"]//table/tbody/tr/td[3]//div[2]/div[2]/span")
    public List<WebElement> teamNames;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/div[2]/ul/li[5]/a")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id=\"app_login_username\"]")
    public WebElement login_username;

    @FindBy(xpath="//*[@id=\"app_login_password\"]")
    public WebElement login_password;

    @FindBy(xpath="//*[@id=\"app_login\"]/div[3]/button")
    public WebElement submit;

    @FindBy(xpath="//*[@id=\"app_login_error\"]/div")
    public WebElement app_error;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[10]/ul/li[7]/a")
    public WebElement world_cup;

    @FindBy(xpath="//div/section[1]/ul/li/article/p")
    public List<WebElement> schedule;

    @FindBy(xpath="//div[2]/div/div[5]/div[2]/div[2]/div/h1")
    public WebElement productName;

}