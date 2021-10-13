package step_definitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.Homepage;

public class SharedStepsUI extends BaseClass {

    //SHARED WEB ELEMENTS GO HERE

    @FindBy(id = "gh-ac")
    public WebElement searchBox;

    @FindBy (id = "gh-cat")
    public WebElement categoryComboBox;

    @FindBy(id = "gh-btn")
    public WebElement searchButton;

    public SharedStepsUI() {
        PageFactory.initElements(driver, this);
    }


    @Before
    public void driverSetUp() {
        String browser = "Chrome";
        setUp(browser);
        openApplication();
    }

    @After
    public void driverTearDown() {
        driver.close();
        driver.quit();
    }

    public Homepage openApplication() {
        String url = "https://ebay.com";
        driver.get(url);
        return new Homepage();
    }

    // SHARED METHODS GO HERE

    public void sendKeysToSearchBox(String searchTerm) {
        sendKeysToInput(searchBox, searchTerm);
    }

    public void selectCategoryByValue(String value) {
        dropdownSelectByValue(categoryComboBox, value);
    }

    public void clickSearchBox() {
        clickOnElement(searchButton);
    }
}