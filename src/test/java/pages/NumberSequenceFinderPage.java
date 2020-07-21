package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NumberSequenceFinderPage extends AbstractBasePage{

    @FindBy(tagName = "h1")
    private WebElement numberSequenceFinderElement;

    @FindBy(id="searchtext")
    private WebElement inputBox;

    @FindBy(id = "searchbutton")
    private WebElement searchButton;

    @FindBy(xpath = "(//p)[2]")
    private WebElement resultText;

    public String getTextOfTheTitle(){
        return numberSequenceFinderElement.getText();
    }
    public void inputText(String input){
        inputBox.sendKeys(input);
    }
    public void clickSearch(){
        searchButton.click();
    }
    public String getResultText(){
        return resultText.getText();
    }

}
