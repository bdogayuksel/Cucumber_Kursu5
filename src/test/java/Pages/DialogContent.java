package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
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

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already exist')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;


    public void deleteItem(String searchingText){

        //Locater kullandığı için burda yazdık

        sendKeysFunction(searchInput, searchingText);
        clickFunction(searchButton);
        //beklet
        //Stale element oldu yani button değişti
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        //fuse-progress-bar/* altta bu 0 olana kadar bekle yaptık

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);


    }

    public WebElement getWebElement(String strButton){

        switch (strButton){
            case "searchButton": return searchButton;
            case "saveButton": return saveBtn;
            case "loginBtn": return loginBtn;
            case "addButton": return addButton;
            case "deleteImageBtn": return deleteImageBtn;
            case "deleteDialogBtn": return deleteDialogBtn;
            case "nameInput": return nameInput;
            case "codeInput": return codeInput;
        }

        return null;

    }




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
