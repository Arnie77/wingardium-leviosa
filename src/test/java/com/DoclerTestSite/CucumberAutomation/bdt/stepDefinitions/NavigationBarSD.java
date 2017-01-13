package com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.DoclerTestSite.CucumberAutomation.bdt.cucumberOptions.RunTest.*;

public class NavigationBarSD {

    @Given("^the Navbar is displayed$")
    public void the_Navbar_is_displayed()  {
        navigationBar.isNavigationBarDisplayed();
    }

    @And("^Home button is available$")
    public void Home_button_is_available(){
        navigationBar.isFormButtonDisplayed();
    }

    @When("^user clicks on Home button$")
    public void user_clicks_on_Home_button()  {
        navigationBar.clickToHomeButton();
    }

    @And("^Home button turns active state$")
    public void home_button_turns_active_state(){
        navigationBar.isHomeButtonActive();
    }

    @And("^Form button is available$")
    public void Form_button_is_available(){
        navigationBar.isFormButtonDisplayed();
    }

    @When("^user clicks on Form button$")
    public void user_clicks_on_Form_button()  {
        navigationBar.clickToFormButton();
    }

    @And("^Form button turns active state$")
    public void Form_button_turns_active_state(){
        navigationBar.isFormButtonActive();
    }

    @When("^user clicks on Error button$")
    public void user_clicks_on_Error_button()  {
        navigationBar.clickToErrorButton();
    }

    @Then("^system gives HTTP 404 response$")
    public void system_gives_HTTP_404_response() {
        errorMethod.verifyErrorMessage();
    }

    @When("^user clicks on Site Logo$")
    public void user_clicks_on_Site_Logo()  {
        navigationBar.clickToSiteLogo();
    }

    @And("^Site Logo is appears$")
    public void Site_Logo_is_appears(){
        navigationBar.isSiteLogoDisplayed();
    }
}
