package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    public void sendKeysFunction(WebElement element, String text) {

        waitUntilVisible(element);
        scrollingProcess(element);
        element.clear();
        element.sendKeys(text);

    }

    public void clickFunction(WebElement element) {

        waitUntilClickable(element);
        scrollingProcess(element);
        element.click();
    }

    public void scrollingProcess(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView;", element);

    }

    public void waitUntilVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}