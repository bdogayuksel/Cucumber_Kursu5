package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    // sol taraftaki menuler burda

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenships;

    @FindBy(xpath = "//span[text()='Nationalities']")
    public WebElement nationalities;

    public WebElement getWebElement(String strButton){

        switch (strButton){
            case "setup": return setup;
            case "parameters": return parameters;
            case "countries": return countries;
            case "citizenships": return citizenships;
            case "nationalities": return nationalities;
        }

        return null;

    }

}