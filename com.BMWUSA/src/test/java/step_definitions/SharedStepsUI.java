package step_definitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import pom.Homepage;

public class SharedStepsUI extends BaseClass {

    //SHARED WEB ELEMENTS GO HERE

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
        String url = "https://www.bmwusa.com/";
        driver.get(url);
        return new Homepage();
    }

    // SHARED METHODS GO HERE

}