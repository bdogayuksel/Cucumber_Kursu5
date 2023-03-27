package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import javax.xml.crypto.Data;
import java.util.List;

public class _06_DataTableSteps {

    LeftNav ln=new LeftNav();

    DialogContent dc=new DialogContent();
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {

        List<String> strButtons= items.asList(String.class);

        for (String strButton:strButtons){

            WebElement element=ln.getWebElement(strButton);

            ln.clickFunction(element);

        }

    }

    @And("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable items) {

        List<String> strButtons= items.asList(String.class);

        for (String button:strButtons) {

            WebElement element = dc.getWebElement(button);

            dc.clickFunction(element);
        }


    }

    @And("User sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dt) {

        List<List<String>> listOfLists=dt.asLists(String.class);

        for (int i = 0; i < listOfLists.size(); i++) {
            WebElement element=dc.getWebElement(listOfLists.get(i).get(0));

            dc.sendKeysFunction(element, listOfLists.get(i).get(1));
        }
    }
}
