package com.DoclerTestSite.CucumberAutomation.utils;

        import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.net.MalformedURLException;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverFactory {

    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;

    public static String baseURL = "http://uitest.duodecadits.com/";

    /**
     *  This function is to invoke Selenium Webdriver
     *
     * @throws MalformedURLException
     * @throws InterruptedException
     */
    public void createDriver() throws MalformedURLException,
            InterruptedException {

        System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");

        driver = new FirefoxDriver();

        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(baseURL);

        waitVar = new WebDriverWait(driver, 5);
    }

    /**
     * This function is to close driver instance
     */
    public void teardown() {

        /**
         * I can't use the driver.quit(), driver.close() because there is some issue between latest Firefox and Selenium 3.0.1
         *
         * driver.close();
         * driver.quit();
         */
        

        // Using robot to close Browser
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);

    }
}