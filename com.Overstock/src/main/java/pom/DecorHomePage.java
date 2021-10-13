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

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/h1")
    public WebElement decorLabel;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li")
    public List<WebElement> featuredCategories;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li[14]/a")
    public WebElement saleItems;

    @FindBy(xpath="//*[@id=\"sort-by-wrapper\"]/div/div[1]/div[2]")
    public WebElement dropDownSortBy;

    @FindBy(xpath="//*[@id=\"sort-by-wrapper\"]/div/div[2]/div/div[5]")
    public WebElement customerRating;

    @FindBy(xpath="//*[@id=\"1\"]//a/div/div[2]/div[1]/p")
    public List<WebElement> listOfProducts;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li[1]/a")
    public WebElement indoorFireplace;

    @FindBy(xpath="//*[@id=\"rugsStoreHub\"]/div/section[2]/ul/li/div[4]/a")
    public WebElement naturalGas;

    @FindBy(xpath="//*[@id=\"priceListHeader\"]/button")
    public WebElement dropDownPrice;

    @FindBy (xpath ="//*[@id=\"price-$30-$40\"]")
    public WebElement checkBoxPrice;

    @FindBy(xpath="//*[@id=\"refinementNav\"]/div[1]/ul/li[2]/a")
    public WebElement checkBoxPriceConfirm;

    @FindBy(xpath="//*[@id=\"1\"]/article/a/div/div[2]/div[1]/p")
    public List<WebElement> listOfFireplace;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[2]/div/a[5]")
    public WebElement throwPillows;

    @FindBy(xpath="//*[@id=\"rugsStoreHub\"]/div/section[1]/ul/li/div[1]/a")
    public WebElement pillowClick;

    @FindBy(xpath="//*[@id=\"1\"]/article[1]/a")
    public WebElement textProduct;

    @FindBy(xpath="//*[contains(@id,\"_\")]/section/div[1]/h1")
    public WebElement productName;

    @FindBy(xpath="//*[@id=\"headerContent\"]/header/div[2]/div[2]/div[3]/div[2]/button")
    public WebElement inputAccount;

    @FindBy(xpath="//*[@id=\"loginIframe\"]")
    public WebElement loginIframe;

    @FindBy(xpath="//*[@id=\"register-email\"]")
    public WebElement inputEmail2;

    @FindBy(xpath="//*[@id=\"register-password\"]")
    public WebElement inputPassword2;

    @FindBy(xpath="//*[@id=\"login-email\"]")
    public WebElement inputEmail;

    @FindBy(xpath="//*[@id=\"login-password\"]")
    public WebElement inputPassword;

    @FindBy(xpath="//*[@id=\"lightbox-close-button\"]")
    public WebElement wheelCloseButton;

    @FindBy(xpath="//*[@id=\"lightbox-close-button2\"]")
    public WebElement wheelCloseButton2;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li[3]/a")
    public WebElement mirrorTab;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]//div[2]//div[1]/div/a[2]/div[4]")
    public WebElement mirrorOnSales;

    @FindBy(xpath="//*[@id=\"1\"]/article[1]/a")
    public WebElement mirrorProduct;

    @FindBy(xpath="//*[@title=\"24\"]")
    public WebElement mirrorSize;

    @FindBy(xpath="//*[@title=\"Walnut\"]")
    public WebElement mirrorColor;

    @FindBy(xpath="//*[@id=\"register-title\"]")
    public WebElement registerTitle;

    @FindBy(xpath="//*[contains(@id,\"post-\")]/div[2]/h3/a")
    public List<WebElement> listOfArticles;

    @FindBy(xpath="//*[@id=\"post-24720\"]/div[2]/h3/a")
    public WebElement pickArticle;

    @FindBy(xpath="//*[@id=\"author-info\"]/span")
    public WebElement authorInfo;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/div/a[1]/div[3]/div/div")
    public WebElement halloweenPic;

    @FindBy(xpath="//*[@id=\"sort-by-wrapper\"]")
    public WebElement sortBy;

    @FindBy(xpath="//*[@id=\"sort-by-wrapper\"]/div/div[2]/div/div[3]")
    public WebElement lowToHigh;

    @FindBy(xpath="//*[@id=\"brands-listHeader\"]/button")
    public WebElement brandsButton;

    @FindBy(xpath="//*[@id=\"brands-list\"]/li/a/div/label/span[1]")
    public List<WebElement> listOfBrands;

    @FindBy(xpath="//*[@id=\"brands-list\"]/li[1]/a")
    public WebElement firstBrand;

    @FindBy(xpath="//*[@id=\"brands-list\"]/li/a")
    public List<WebElement> listOfWebsites;

    @FindBy(xpath="//*[@id=\"1\"]/article[1]/a/div/div[2]/div[2]/div")
    public WebElement clickArrow;

    @FindBy(xpath=" //*[@class = \"_2prWDD\"]")
    public WebElement description;

    @FindBy(xpath="//*[@id=\"buyingGuide_tierOneGuideReadmoreBtn__1aq-v\"]")
    public WebElement clickArticle;

    @FindBy(xpath="//*[@id=\"content\"]//div[5]//div[2]/span/h2")
    public List<WebElement> listOfSteps;

    @FindBy(xpath="//*[@id=\"movie_player\"]/div[4]/button")
    public WebElement playButton;

    @FindBy(xpath="//*[@id=\"content\"]//div[6]//iframe")
    public WebElement videoIframe;

    @FindBy(xpath="//*[@title = \"Pause (k)\"]")
    public WebElement pauseButton;

    @FindBy(xpath="//*[@id=\"ft\"]/footer//div[3]/a/span")
    public List<WebElement> companyInformation;

    @FindBy(xpath="//*[@id=\"ft\"]//div[3]/a[3]")
    public WebElement newsRoom;

    @FindBy(xpath="//*[@id=\"executive-team\"]/li/div[1]/h4")
    public List<WebElement> teamNames;

    @FindBy(xpath="//*[@id=\"executive-team\"]/li/div[1]/p")
    public List<WebElement> teamPositions;

    @FindBy(xpath="//*[@id=\"lpo_app\"]/div/div[5]/div/div[1]/a")
    public WebElement downloadZIP;

    @FindBy(xpath="//*[@id=\"lpo_app\"]/div/div[5]/div/p")
    public WebElement textForZIP;

    @FindBy(xpath="//*[@id=\"TopNav\"]/div[1]/div[3]/div/div/div[3]/a[5]")
    public WebElement clocks;

    @FindBy(xpath="//*[@id=\"footer-wrapper\"]/div[3]/div/div[3]/div/h4/a")
    public List<WebElement> clockTypes;

    @FindBy(xpath="//*[@id=\"footer-wrapper\"]/div[3]/div/div[3]/div/h4/a")
    public List<WebElement> clockTypesHREF;

    @FindBy(xpath="//*[@name=\"smileyFeedback\"]")
    public List<WebElement> feedBack;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li[9]/a")
    public WebElement lightningTab;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[2]/div/a/div[2]")
    public List<WebElement> lighningList;

    @FindBy(xpath="//*[@id=\"buyingGuide_tierOneGuideReadmoreBtn__1aq-v\"]")
    public WebElement clickReadMore;

    @FindBy(xpath="//*[@id=\"content\"]//div[5]//div[2]/span/h2")
    public List<WebElement> lighningStyles;

    @FindBy(xpath="//*[@id=\"login-form\"]/button")
    public WebElement submitButton;

    @FindBy(xpath="//*[@id=\"login-form\"]/div[3]/span")
    public WebElement registerErrorMessage;

}