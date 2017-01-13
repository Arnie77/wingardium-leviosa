package com.DoclerTestSite.CucumberAutomation.web.pages;

import static com.DoclerTestSite.CucumberAutomation.utils.DriverFactory.*;
import static junit.framework.TestCase.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Arnie on 2017.01.12..
 */
public class NavigationBar{

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

    public void isNavigationBarDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
    }

    public void isSiteLogoDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(SiteLogo));
    }

    public void clickToSiteLogo() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(SiteLogo).click();
    }

    public void isHomeButtonDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(HomeButton).isDisplayed();
    }
    public void isHomeButtonActive() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(ActiveHomeButton).isDisplayed();
    }
    public void clickToHomeButton() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(HomeButton).click();
    }

    public void isFormButtonDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(FormButton).isDisplayed();
    }
    public void isFormButtonActive() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(ActiveFormButton).isDisplayed();
    }
    public void clickToFormButton() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(FormButton).click();
    }

    public void isErrorButtonDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(ErrorButton).isDisplayed();
    }
    public void clickToErrorButton() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(NavBarBody));
        driver.findElement(ErrorButton).click();
    }

}
