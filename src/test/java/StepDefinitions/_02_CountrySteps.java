package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {

        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,"iKa1657");
        dc.sendKeysFunction(dc.codeInput,"1116");
        dc.clickFunction(dc.saveBtn);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.successMessage,"success");

    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.codeInput,code);
        dc.clickFunction(dc.saveBtn);
    }


}