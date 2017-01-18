package com.DoclerTestSite.CucumberAutomation.utils;

        import java.util.List;
        import java.util.NoSuchElementException;
        import java.util.StringTokenizer;

        import org.junit.Assert;
        import org.openqa.selenium.*;
        import org.openqa.selenium.support.ui.ExpectedConditions;

        import static com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions.Hooks.scenario;


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
            scenario.write("The element can't found: " + locator.toString());
            Assert.fail();
        }
        catch (TimeoutException e){
            scenario.write("Timeout. The element can't found: " + locator.toString());
            Assert.fail();
        }
        catch (Exception e){
            scenario.write("There was problem with find the element: " + locator.toString());
            Assert.fail();
        }
    }

    public void checkElementIsDisplayed(By locator){
        WebElement element = checkElementExists(locator);
        if (element != null){
            element.isDisplayed();
        }
        else {
            scenario.write("The element can't found: " + locator.toString());
            Assert.fail();
        }
    }

    public void clickToElement(By locator){
        WebElement element = checkElementExists(locator);
        if (element != null){
            element.click();
        }
        else {
            scenario.write("The element can't found: " + locator.toString());
            Assert.fail();
        }
    }

    public void sendStringToElement(By locator, String text){
        WebElement element = checkElementExists(locator);
        if (element != null){
            element.sendKeys(text);
        }
        else {
            scenario.write("The element can't found: " + locator.toString());
            Assert.fail();
        }
    }



}