package com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.DoclerTestSite.CucumberAutomation.bdt.cucumberOptions.RunTest.*;

public class HomePageSD {


    @Given("^user is on landing page$")
    public void user_is_on_landing_page()  {
        navigationBar.isNavigationBarDisplayed();
        homePage.isHomePageDisplayed();
    }

    @Then("^home page loads$")
    public void home_page_loads() {
        homePage.isHomePageDisplayed();
    }

    @And("^the company logo on home page appears$")
    public void the_company_logo_on_home_page_appears() {
        homePage.isCompanyLogoVisibleInHomePage();
    }

}
