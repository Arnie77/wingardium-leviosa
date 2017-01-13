package com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.DoclerTestSite.CucumberAutomation.bdt.cucumberOptions.RunTest.*;

public class FormPageSD {

    @Then("^form page loads$")
    public void form_page_loads() {
        formPage.isFormPageDisplayed();
    }

    @And("^form section loads$")
    public void form_section_loads() {
        formPage.isformsectionDisplayed();
    }

    @And("^the company logo on form page is appears$")
    public void the_company_logo_on_form_page_is_appears() {
        formPage.isCompanyLogoVisibleInFormPage();
    }

    @When("^user enters \"(.*?)\" on the box$")
    public void user_enters_on_the_box(String arg1) {
        formPage.enterTextBox(arg1);
    }

    @And("^user clicks the GO button$")
    public void user_clicks_the_GO_button() {
        formPage.clickToTheGoButton();
    }

    @Then("^system gives back the \"(.*?)\"$")
    public void system_gives_back_the(String arg2) {
        formPage.checkFormresult(arg2);
    }

}
