package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id ="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (linkText = "Gift Cards")
    public WebElement giftCardLink;
    
}
