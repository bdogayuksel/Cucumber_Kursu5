package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(css="span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//login[@class='ng-star-inserted']")
    public WebElement TechnoStudy;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;





    /*

    Sonra kullanıcaz

    public void findAndClick(WebElement element){

       clickFunction(element);

    }





    public void findAndSend(WebElement element, String text){




       WebElement myElement=null;
        if(strElement=="username")
            myElement=username;
        if(strElement=="pasword")
            myElement=password;



        sendKeysFunction(element, text);

    }
    */
}
