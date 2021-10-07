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
}