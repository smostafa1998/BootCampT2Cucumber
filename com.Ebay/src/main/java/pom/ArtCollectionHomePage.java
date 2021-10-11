package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ArtCollectionHomePage extends BaseClass {
    public ArtCollectionHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the art page
     */

    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]//h1/span[2]")
    public WebElement searchTerm;

    @FindBy(xpath="//*[@id=\"s0-15-6-0-1[1]-0\"]/div[1]/div[2]/h1")
    public WebElement artlabel;

    @FindBy (xpath = "//*[@id=\"s0-16-13-0-1[0]-0-0\"]/ul/li[1]/a")
    public WebElement teddyLabel;

    @FindBy (xpath = "//*[@id=\"mainContent\"]/section[1]//div[2]")
    public List<WebElement> dollBrands;

    @FindBy(xpath="//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]")
    public WebElement comicsLabel;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[3]-0-0-0\"]/ul/li[2]/a")
    public WebElement auctionsEndingSoon;

    @FindBy (xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-1-6-5-34\"]")
    public WebElement auctionSortButton;

    @FindBy (xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-1-6-5-34-7-44\"]/ul/li[8]/a/span")
    public WebElement mostBids;

    @FindBy (xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-1\"]/ul//div[2]/a/h3")
    public List<WebElement> numOfResults;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[0]-0-0\"]/ul/li[3]/a")
    public WebElement antiquesLink;

    @FindBy(xpath="//*[@id=\"mainContent\"]/section[1]/div[1]/a")
    public WebElement stylesLink;

    @FindBy(xpath="//*[@id=\"keywordSearch\"]/form/div/input")
    public WebElement keywordSearch;

    @FindBy (xpath="//*[@id=\"keywordSearch\"]/form/button")
    public WebElement keywordSearchButton;

    @FindBy(xpath="//*[@id=\"s0-27-9-0-1[0]-0-1\"]/ul//div[2]/a/h3")
    public List<WebElement> productList;

    @FindBy (xpath="//*[@id=\"gh-cat-box\"]")
    public WebElement categoryBox;

    @FindBy (xpath="//*[@id=\"gh-cat\"]")
    public WebElement selectCategory;

    @FindBy(xpath="//*[@id=\"gh-ac\"]")
    public WebElement searchBox;

    @FindBy(xpath="//*[@id=\"gh-btn\"]")
    public WebElement searchButton;

    @FindBy(xpath="//*[@id=\"x-refine__group_1__0\"]/ul/li[2]/div/a/div")
    public WebElement DisneyCheckbox;

    @FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li/div/div[2]/a/h3")
    public List<WebElement> disneySCList;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[2]-0-0-0\"]/ul/li[3]/a")
    public WebElement vintageAntiqueCategory;

    @FindBy (xpath="//*[@id=\"s0-27-9-0-1[0]-0-1[1]-0-18-list\"]/li[2]/a")
    public WebElement AGI;

    @FindBy(xpath="//*[@id=\"s0-27-9-0-1[0]-0-1-6-6-4[2]-flyout\"]/button ")
    public WebElement buttonBrand;

    @FindBy(xpath="//*[@id=\"s0-27-9-0-1[0]-0-1-6-6-4[2]-flyout\"]/div/ul/li[1]/a")
    public WebElement newBox;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[0]-0-0\"]/ul/li/a")
    public List<WebElement> jewleryList;

    @FindBy(xpath="//*[@id=\"s0-27-9-0-1[0]-0-1-6-5\"]/div[2]//h2")
    public WebElement numofJewleryResults;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[4]-0-0-0\"]/ul/li/a")
    public WebElement sellSomething;

    @FindBy(xpath="//*[@id=\"categories_list\"]/div[1]/button")
    public WebElement popularFeaturedButton;

    @FindBy(xpath="//*[@id=\"categories_list\"]/div[2]/div/ul/li/a")
    public List<WebElement> categoryList;

    @FindBy(xpath="//*[@id=\"categories_list\"]/div[2]/div/ul/li[36]/a")
    public WebElement videoAndGame;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[0]-34-selectField\"]/label/div[2]")
    public WebElement conditionBox;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[0]-34-menuList-optionsText\"]/li[2]/button")
    public WebElement condition;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[1]-36-selectField\"]/label/div[1]")
    public WebElement brandBox;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[1]-36-menuList-optionsText\"]/li[1]/button")
    public WebElement brand;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[2]-38-selectField\"]/label/div[1]")
    public WebElement modelBox;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[2]-38-menuList-optionsText\"]/li[3]/button")
    public WebElement model;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[3]-40-selectField\"]/label/div[1]")
    public WebElement platformBox;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[3]-40-menuList-optionsText\"]/li/button")
    public WebElement platform;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[4]-42-selectField\"]/label/div[1]")
    public WebElement regionBox;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0-ebayCarousel-6[4]-42-menuList-optionsText\"]/li[1]/button")
    public WebElement region;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-1-0\"]/div[1]/div[2]/div[2]")
    public WebElement avgPrice;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[3]-0-0-0\"]/ul/li[3]/a")
    public WebElement caseBreaks;

    @FindBy(xpath="//*[@id=\"s0-14-11-0-1-2-6-0-2[1]-20[1]-4\"]/button")
    public WebElement buttonSports;

    @FindBy(xpath="//*[@id=\"c3-subPanel\"]/fieldset/div[1]/div/label/div/div/span[1]")
    public List<WebElement> columnX;

    @FindBy(xpath="//*[@id=\"c3-subPanel\"]/fieldset/div[1]/div/label/div/div/span[1]")
    public List<WebElement> columnY;

    @FindBy(xpath="//*[@id=\"c3-subPanel\"]/fieldset/div[1]/div[1]")
    public WebElement firstCheckBox;

    @FindBy(xpath="//*[@id=\"c3-subPanel\"]/fieldset/div[1]/div[2]")
    public WebElement secondCheckbox;

    @FindBy(xpath="//*[@id=\"x-overlay__form\"]/div[1]/button")
    public WebElement closeButton;

    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[6]//nav[2]/ul/li[7]/a")
    public WebElement bullionButton;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[3]-0-0-0\"]/ul/li[1]/a")
    public WebElement bullionGlossary;

    @FindBy(xpath="//*[@id=\"glossary-nav\"]/div/a[21]")
    public WebElement sLetter;

    @FindBy(xpath="//*[@id=\"glossary\"]/li/h3")
    public List<WebElement> glossaryList;

    @FindBy(xpath="//*[@id=\"glossary\"]/li/p")
    public List<WebElement> glossaryDefinitionList;

    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[8]/a")
    public WebElement consigmentButton;

    @FindBy(xpath="//*[@id=\"seller-success-stories\"]/div/div[2]/div[1]/div[2]/div[2]/a")
    public WebElement videoButton;

    @FindBy(xpath="//*[@id=\"video-frame\"]")
    public WebElement iframe;

    @FindBy(xpath="//*[@class = \"ytp-large-play-button ytp-button\"]")
    public WebElement playButton;

    @FindBy(xpath="//*[@title =\"Pause (k)\"]")
    public WebElement pauseButton;

    @FindBy(xpath="//*[@id=\"seller-success-stories\"]//div[1]/div[2]/div[1]/p")
    public WebElement videoText;

    @FindBy(xpath="//*[@id=\"categories_list\"]/div[2]/div/ul/li[16]/a")
    public WebElement videoCategory;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[0]-34-selectField\"]")
    public WebElement A;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[1]-36-selectField\"]")
    public WebElement B;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[1]-36-selectField-searchbox\"]")
    public WebElement Binput;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[2]-38-selectField\"]")
    public WebElement C;

    @FindBy(xpath="//*[@id=\"s0-11-13-0-1[2]-0-0-0-ebayCarousel-6[2]-38-selectField-searchbox\"]")
    public WebElement Cinput;

}