package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TurnaPage {

    public TurnaPage(){
        PageFactory.initElements(Driver.getAndroidDriver(),this);
    }
    @FindBy(xpath = "//*[@text='Hesabım']")
    public WebElement hesabim;
}
