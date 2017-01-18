package com.DoclerTestSite.CucumberAutomation.web.pages;

import com.DoclerTestSite.CucumberAutomation.utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Arnie on 2017.01.12..
 */
public class NavigationBar extends ElementHandler {

    /**
     * All locators will be mentioned here
     *
     * For this example i am not using properties file for reading locators
     */

    By SiteLogo = By.xpath("//*[@id='site'][text()='UI Testing Site']");
    By NavBarBody = By.xpath("//nav/div/div[@id='navbar']");
    By HomeButton = By.id("home");
    By ActiveHomeButton = By.xpath("//li[@class='active']/a[@id='home']");
    By FormButton = By.id("form");
    By ActiveFormButton = By.xpath("//li[@class='active']/a[@id='form']");
    By ErrorButton = By.id("error");



    /**
     * All functions related to behavior will follow now
     */

    public void waitForNavigationBarIsDisplayed() {
       waitForElementAppearance(NavBarBody);
    }

    public void isSiteLogoDisplayed() {
        waitForNavigationBarIsDisplayed();
        checkElementIsDisplayed(SiteLogo);
    }

    public void clickToSiteLogo() {
        waitForNavigationBarIsDisplayed();
        clickToElement(SiteLogo);
    }

    public void isHomeButtonDisplayed() {
        waitForNavigationBarIsDisplayed();
        checkElementIsDisplayed(HomeButton);
    }
    public void isHomeButtonActive() {
        waitForNavigationBarIsDisplayed();
        checkElementIsDisplayed(ActiveHomeButton);
    }
    public void clickToHomeButton() {
        waitForNavigationBarIsDisplayed();
        clickToElement(HomeButton);
    }

    public void isFormButtonDisplayed() {
        waitForNavigationBarIsDisplayed();
        checkElementIsDisplayed(FormButton);
    }
    public void isFormButtonActive() {
        waitForNavigationBarIsDisplayed();
        checkElementIsDisplayed(ActiveFormButton);
    }

    public void clickToFormButton() {
        waitForNavigationBarIsDisplayed();
        clickToElement(FormButton);
    }

    public void isErrorButtonDisplayed() {
        waitForNavigationBarIsDisplayed();
        checkElementIsDisplayed(ErrorButton);
    }
    public void clickToErrorButton() {
        waitForNavigationBarIsDisplayed();
        clickToElement(ErrorButton);
    }

}
