package pom;

import base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }
}
