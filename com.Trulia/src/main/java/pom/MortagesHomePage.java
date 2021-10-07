package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MortagesHomePage extends BaseClass {
    public MortagesHomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the mortage page
     */


    @FindBy(xpath = "//*[@id=\"main-content\"]//div[1]/div[1]/div[1]/h2/div")
    public WebElement mortageText;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]//div[2]//div[2]/input")
    public WebElement inputZipCode;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]//div[2]//div[2]/button")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"long-form\"]/div[2]/div[1]//p")
    public WebElement paragraphNo;

    @FindBy(xpath = "//*[@id=\"long-form\"]/div[2]/div[1]//a[2]")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[2]/div[3]/table/tbody/tr/td[1]/span")
    public List<WebElement> loanTypes;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[2]/div[3]/table/tbody/tr/td[2]/span")
    public List<WebElement> bestFors;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]//div[2]//div[1]//div[1]/ul/li[6]//span/div")
    public WebElement clickEstate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]//div[2]/footer/div[1]//div[1]/ul/li[34]/a")
    public WebElement nyEstate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/div/div/div/a")
    public List<WebElement> queenCounties;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[1]/div[3]//span//div[2]/span")
    public WebElement seeMore;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[1]/div[3]/div/div[1]/div/div/div[2]/button")
    public WebElement lenderDirectory;

    @FindBy(xpath = "//*[@id=\"Rating\"]")
    public WebElement ratingButton;

    @FindBy(xpath = "//*[@id=\"static-mortgage-lender-directory\"]//div[2]/ul/li//div[2]/a[1]")
    public List<WebElement> bestRated;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[1]/div[2]/div[1]//div[2]/button")
    public WebElement affordCalculator;

    @FindBy(xpath = "//*[@id=\"annualIncomeInput\"]")
    public WebElement annualIncomeInput;

    @FindBy(xpath = "//*[@id=\"downPaymentInput\"]")
    public WebElement downPaymentInput;

    @FindBy(xpath = "//*[@id=\"otherMonthlyDebts\"]")
    public WebElement otherMonthlyDebts;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]//div[1]/div[4]/div/div[2]")
    public WebElement clickOnCredit;

    @FindBy(xpath = "//*[@id=\"creditScoreInput\"]")
    public WebElement creditScoreInput;

    @FindBy(xpath = "//*[@id=\"zipCodeInput\"]")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"debtToIncomeRatioSlider\"]")
    public WebElement slider;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]//main/div[2]/div[1]//div[2]//div[3]//div[1]/span[2]")
    public WebElement affordHome;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[1]/div[2]/div[2]//div[2]/button")
    public WebElement mortageCalculator;

    @FindBy(xpath = "//*[@id=\"HomePriceInput\"]")
    public WebElement HomePriceInput;

    @FindBy(xpath = "//*[@id=\"DownPaymentInput\"]")
    public WebElement DownInput;

    @FindBy(xpath = "//*[@id=\"LoanTypeInput\"]")
    public WebElement LoanTypeInput;

    @FindBy(xpath = "//*[@id=\"ZipcodeInput\"]")
    public WebElement ZipcodeInput;

    @FindBy(xpath = "//*[@id=\"main-content\"]//div[4]/div[1]/div/div[2]/div/div[1]")
    public WebElement perMonth;

    @FindBy(xpath = "//*[@id=\"main-content\"]//div[1]/div[2]/div[3]//div[2]/button")
    public WebElement homeCalculator;

    @FindBy(xpath = "//*[@id=\"loanAmount\"]")
    public WebElement loanAmount;

    @FindBy(xpath = "//*[@id=\"rate\"]")
    public WebElement rate;

    @FindBy(xpath = "//*[@id=\"term\"]")
    public WebElement term;

    @FindBy(xpath = "//*[@id=\"originationYear\"]")
    public WebElement originationYear;

    @FindBy(xpath = "//*[@id=\"newLoanAmount\"]")
    public WebElement newLoanAmount;

    @FindBy(xpath = "//*[@id=\"newRate\"]")
    public WebElement newRate;

    @FindBy(xpath = "//*[@id=\"newTerm\"]")
    public WebElement newTerm;

    @FindBy(xpath = "//*[@id=\"fees\"]")
    public WebElement fees;

    @FindBy(xpath = "//*[@id=\"refinance-calc\"]/div/div[2]/div[1]/span")
    public WebElement textSaveFinal;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[1]/div[3]//div[2]//div[2]/button")
    public WebElement todayMortageRate;

    @FindBy(xpath = "//*[contains(@id,\"content_purchase_\")]/form/div[1]/div/div[1]/input")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//*[contains(@id,\"content_purchase_\")]/form/div[1]/div/div[2]/input")
    public WebElement purchasePrice;

    @FindBy(xpath = "//*[contains(@id,\"content_purchase_\")]/form/div[1]/div/div[3]/input[2]")
    public WebElement downPaymentPercentage;

    @FindBy(xpath = "//*[contains(@id,\"content_purchase_\")]/form/div[1]/div/div[4]/div[2]/div")
    public WebElement creditScoreBox;

    @FindBy(xpath = "//*[@id=\"creditScore\"]")
    public WebElement selectCreditScore;

    @FindBy(xpath = "//*[contains(@id,\"content_purchase_\")]/form/div[2]/button")
    public WebElement seeRates;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[3]/div[2]/div/div/h3")
    public List<WebElement> morgageOptions;

    @FindBy(xpath = "//*[@id=\"__next\"]//div[4]/ul/li[2]/a")
    public WebElement popularCounties;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]//a")
    public List<WebElement> Top100;

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div//div[2]//div[32]/div/a")
    public WebElement Hamilton;

    @FindBy(xpath="//*[@id=\"main-content\"]/div[1]/div/ul//button[2]")
    public WebElement otherButton;

    @FindBy(xpath="//*[@id=\"resultsColumn\"]/div[2]/div/div/div/div/div/div")
    public WebElement clickSort;

    @FindBy(xpath="//*[@data-testid=\"sort-select\"]")
    public WebElement selectSort;

    @FindBy(xpath="//*[@id=\"resultsColumn\"]/div[2]/ul/li[1]/div/div/div/div/div[1]/div[2]/div")
    public WebElement favoriteButton;

    @FindBy(xpath="//*[@id=\"modal-container-1\"]//form/button")
    public WebElement clickSubmit;

    @FindBy(xpath="//*[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath="//*[@id=\"modal-container-1\"]/div/div/div/div/div[1]/div[1]/div")
    public WebElement saveText;

    @FindBy(xpath="//*[@id=\"main-content\"]//ul/li/div/h3/div/a")
    public List<WebElement> truliaArticles;

    @FindBy(xpath="//*[@id=\"main-content\"]//ul/li[1]/div/h3/div/a")
    public WebElement firstArticle;

    @FindBy(xpath="//*[contains(@id,\"immersive_panel_2_\")]/h3")
    public List<WebElement> canIAfford;

    @FindBy(xpath="//*[contains(@id,\"post-\")]//div[3]/div/div[2]/a")
    public WebElement nextArticle;

    @FindBy(xpath="//*[contains(@id,\"post-\")]//div[3]/div/div[2]/a/h6")
    public WebElement nextArticleTitle;


}