package com.DoclerTestSite.CucumberAutomation.utils;

        import java.util.List;
        import java.util.NoSuchElementException;
        import java.util.StringTokenizer;

        import org.junit.Assert;
        import org.openqa.selenium.*;
        import org.openqa.selenium.support.ui.ExpectedConditions;


public class ElementHandler extends DriverFactory{

    private WebElement checkElementExists (By locator){
        List <WebElement> elements = driver.findElements(locator);
        if (elements.size() > 0){
            return elements.get(0);
        }
        return null;
    }

    public void waitForElementAppearance(By locator){
        try{
            waitVar.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (NoSuchElementException e){
            Assert.fail();
        }
        catch (Exception e){
            Assert.fail();
        }
    }

    public void checkElementIsDisplayed(By locator){
        WebElement element = checkElementExists(locator);
        if (element != null){
            element.isDisplayed();
        }
        else {
            Assert.fail();
        }
    }

    public void clickToElement(By locator){
        WebElement element = checkElementExists(locator);
        if (element != null){
            element.click();
        }
        else {
            Assert.fail();
        }
    }

    public void sendStringToElement(By locator, String text){
        WebElement element = checkElementExists(locator);
        if (element != null){
            element.sendKeys(text);
        }
        else {
            Assert.fail();
        }
    }



}