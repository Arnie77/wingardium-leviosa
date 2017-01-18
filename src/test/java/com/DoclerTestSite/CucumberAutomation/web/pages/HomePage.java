package com.DoclerTestSite.CucumberAutomation.web.pages;

import static com.DoclerTestSite.CucumberAutomation.utils.DriverFactory.*;

import com.DoclerTestSite.CucumberAutomation.utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends ElementHandler{

    /**
     * All locators will be mentioned here
     *
     * For this example i am not using properties file for reading locators
     */

    By WelcomeText = By.xpath("//h1[text()='Welcome to the Docler Holding QA Department']");
    By Description = By.xpath("//p[text()='This site is dedicated to perform some exercises and demonstrate automated web testing.']");
    By CompanyLogo = By.xpath("//*[@id='dh_logo'and@src='assets/img/dh_company_lux_doclerholding.jpg'and@alt='Docler Holding']");

    /**
     * All functions related to behavior will follow now
     */
    public void isHomePageDisplayed() {
        waitForElementAppearance(WelcomeText);
        waitForElementAppearance(Description);
        isCompanyLogoVisibleInHomePage();
    }

    public void isCompanyLogoVisibleInHomePage() {
        waitForElementAppearance(CompanyLogo);
    }

}