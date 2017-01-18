package com.DoclerTestSite.CucumberAutomation.web.pages;

import com.DoclerTestSite.CucumberAutomation.utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.xml.soap.Text;

import static com.DoclerTestSite.CucumberAutomation.utils.DriverFactory.*;

public class FormPage extends ElementHandler {

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
        waitForElementAppearance(TitleText);
    }

    public void isCompanyLogoVisibleInFormPage(){
        waitForElementAppearance(CompanyLogo);
    }

    public void isformsectionDisplayed() {
        waitForElementAppearance(TextBox);
        waitForElementAppearance(GoButtonRelatedToTextBox);
    }

    public void enterTextBox(String text){
        sendStringToElement(TextBox, text);
    }

    public void clickToTheGoButton() {
        clickToElement(GoButtonRelatedToTextBox);
    }

    public void checkFormresult(String resultText) {
        /**
         * xpath pattern: //[@id="textBoxId"][text()='TextEntered']
         */
        String xpathTextSecondPart = "[text()='"+resultText+"']";
        By path = By.xpath(FormResultTextXpathFirstPart+xpathTextSecondPart);
        waitForElementAppearance(path);    }


}