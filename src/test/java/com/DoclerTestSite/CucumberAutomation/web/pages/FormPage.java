package com.DoclerTestSite.CucumberAutomation.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.DoclerTestSite.CucumberAutomation.utils.DriverFactory.*;

public class FormPage {

    /**
     * All locators will be mentioned here
     *
     * For this example i am not using properties file for reading locators
     */

    By TitleText = By.xpath("//h1[text()='Simple Form Submission']");
    By TextBox = By.id("hello-input");
    By GoButtonRelatedToTextBox = By.id("hello-submit");
    By CompanyLogo = By.xpath("//*[@id='dh_logo'and@src='assets/img/dh_company_lux_doclerholding.jpg'and@alt='Docler Holding']");
    String FormResultTextXpathFirstPart = "//h1[@id='hello-text']";

    /**
     * All functions related to behavior will follow now
     */

    public void isFormPageDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(TitleText));
    }

    public void isCompanyLogoVisibleInFormPage(){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(CompanyLogo));
    }

    public void isformsectionDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(TextBox));
        waitVar.until(ExpectedConditions.presenceOfElementLocated(GoButtonRelatedToTextBox));
    }

    public void enterTextBox(String text){
        driver.findElement(TextBox).sendKeys(text);
    }

    public void clickToTheGoButton() {
        driver.findElement(GoButtonRelatedToTextBox).click();
    }

    public void checkFormresult(String resultText) {
        /**
         * xpath pattern: //[@id="textBoxId"][text()='TextEntered']
         */
        String xpathTextSecondPart = "[text()='"+resultText+"']";
        By path = By.xpath(FormResultTextXpathFirstPart+xpathTextSecondPart);
        waitVar.until(ExpectedConditions.presenceOfElementLocated(path));
    }


}