package com.DoclerTestSite.CucumberAutomation.web.function;

import com.DoclerTestSite.CucumberAutomation.utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.DoclerTestSite.CucumberAutomation.utils.DriverFactory.*;

public class ErrorMethod extends ElementHandler{

    /**
     * All locators will be mentioned here
     *
     * For this example i am not using properties file for reading locators
     */

     By errorMessage = By.xpath("//h1[text()='404 Error: File not found :-(']");

    /**
     * All functions related to behavior will follow now
     */

    public void verifyErrorMessage() {
        waitForElementAppearance(errorMessage);
    }
}

