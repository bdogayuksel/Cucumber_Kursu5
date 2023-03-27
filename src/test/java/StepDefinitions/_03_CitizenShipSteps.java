package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_CitizenShipSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to citizenship page")
    public void navigateToCitizenshipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenships);

    }

    @When("Create a new citizenship")
    public void createANewCitizenship() {

        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,"dadaada");
        dc.sendKeysFunction(dc.shortName,"daada");
        dc.clickFunction(dc.saveBtn);


    }

    @When("User a CitizenShip name as {string} short name as {string}")
    public void userACitizenShipNameAsShortNameAs(String name, String shortName) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName,shortName);
        dc.clickFunction(dc.saveBtn);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist,"already");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchingText) {
        dc.deleteItem(searchingText);

    }


}
