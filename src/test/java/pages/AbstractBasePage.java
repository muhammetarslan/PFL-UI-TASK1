package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public abstract class AbstractBasePage {

    public AbstractBasePage(){
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }
    @FindBy(css = "a[href=\"/greeting\"]")
    private WebElement find123aHref;

    public void navigateToFind123(){
        find123aHref.click();
    }

}
