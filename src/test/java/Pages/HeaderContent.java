package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderContent extends Parent{

    public HeaderContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='Buy']")
    private WebElement buyButton;

    @FindBy(css="button[data-test='price-filters-button']")
    private WebElement priceFilterButton;

    @FindBy(xpath="//button[text()='$100,000+']")
    private WebElement option100kMin;

    @FindBy(xpath="//button[text()='$600,000']")
    private WebElement price600kMax;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "buyButton" : myElement =buyButton; break;
            case "priceFilterButton" : myElement =priceFilterButton; break;
            case "option100kMin" : myElement =option100kMin; break;
            case "price600kMax" : myElement =price600kMax; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

        }

        verifyContainsText(myElement,text);
    }

}
