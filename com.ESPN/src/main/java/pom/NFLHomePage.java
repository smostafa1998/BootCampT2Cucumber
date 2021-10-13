

package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NFLHomePage extends BaseClass {
    public NFLHomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the soccerpage
     */

    @FindBy(xpath = "//*[@id=\"global-nav-secondary\"]/div/ul/li[1]/span/a/span[2]")
    public WebElement nflLabel;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul[1]/li[2]/a")
    public WebElement scoresLabel;

    @FindBy(xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[1]/button")
    public WebElement yearDropdown;

    @FindBy(xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[1]/ul/li[3]/a")
    public WebElement yearDropdownSelect;

    @FindBy(xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[2]/button")
    public WebElement weekDropdown;

    @FindBy(xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[2]/ul/li[1]/a")
    public WebElement weekDropdownSelect;

    @FindBy(xpath = "//*[@id=\"events\"]/div/h2")
    public WebElement dateHallofFame;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[1]//ul[2]//a")
    public List<WebElement> listOfNFLTeams;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/section[3]/div[1]//ul/li/a")
    public List<WebElement> listOfNFLHeadlines;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/section[3]/div[1]//ul/li[1]/a")
    public WebElement firstResult;

    @FindBy(xpath = "//*[@id=\"article-feed\"]/article[1]//div[2]/div[1]//li/div[2]")
    public WebElement authorsBio;

    @FindBy(xpath = "//*[@id=\"global-nav-secondary\"]/div/ul/li[8]/a")
    public WebElement fantasyFootball;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]//div[5]//div[3]//div[2]/div[2]/section[1]//button")
    public WebElement createLeague;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]//div[5]//div[2]//div[1]//div/input")
    public WebElement inputTitle;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]//div[5]//div[3]//div[2]/div[2]/section[3]//button")
    public WebElement joinLeague;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]/div/div[2]/nav/ul/li[3]/a")
    public WebElement signUp;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]//div[2]//div[2]/div/label[2]/div/div")
    public WebElement groupNum;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]//div[2]//div[3]/div/label[1]/div/div")
    public WebElement scoringType;

    @FindBy(xpath = "//*[@id=\"fitt-analytics\"]//div[5]//div[2]//div[2]/div/section/div/div/div[1]/label[1]")
    public WebElement experienceText;

    @FindBy(xpath = "//*[@id=\"global-nav-secondary\"]/div/ul/li[10]/a")
    public WebElement depthCharts;

    @FindBy(xpath = "//*[@id=\"article-feed\"]/article[1]/div/div[2]/h2/a")
    public List<WebElement> hrefLinks;

    @FindBy(xpath = "//*[@id=\"article-feed\"]/article[1]/div/div[2]/h2[2]/a")
    public WebElement buffaloBills;

    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]//div[1]//div[2]/div[4]/div[1]/ul/li")
    public List<WebElement> listOfGlossary;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[1]//ul[1]/li[6]/a")
    public WebElement teamLink;

    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]//div[1]/div[1]/div[2]/div[3]//span[3]/a")
    public WebElement newEnglandPatriots;

    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]//div[1]/div[2]//div[2]/table/tbody/tr/td[2]/div/a")
    public List<WebElement> rosterNE;

    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]/div[2]/div[2]/nav/ul/li[7]")
    public WebElement injuries;

    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]//div/div/a/div/div[2]/h3")
    public List<WebElement> rosterNamesNE;

    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]//div/div//div[2]/div[1]/span[2]")
    public List<WebElement> rosterStatusNE;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[9]/div/ul[1]/li[4]/a")
    public WebElement fantasyBasketball;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[9]/a")
    public WebElement fantasyLink;

    @FindBy(xpath="//*[@id=\"fitt-analytics\"]/div/div[5]/div/div[2]/div/div/div[2]/div[2]/section[1]/div/button")
    public WebElement addLeagueBasketball;

    @FindBy(xpath="//div[2]/div/section/div/div/button")
    public WebElement createLeagueButton;

    @FindBy(xpath="//*[@type=\"email\"]")
    public WebElement email;

    @FindBy(xpath="//*[@type=\"password\"]")
    public WebElement password;

    @FindBy(xpath="//*[@id=\"did-ui-view\"]/div/section/section/form/section/div[3]/button")
    public WebElement submit;

    @FindBy(xpath="//*[@id=\"did-ui-view\"]/div/section/div/div/div")
    public WebElement errorMessage;

    @FindBy(xpath="//*[@id=\"disneyid-iframe\"]")
    public WebElement iframe;


}
