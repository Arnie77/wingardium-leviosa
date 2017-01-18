package com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions;

        import java.net.MalformedURLException;

        import com.DoclerTestSite.CucumberAutomation.utils.DriverFactory;

        import cucumber.api.Scenario;
        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;

        import static com.DoclerTestSite.CucumberAutomation.utils.DriverFactory.driver;

public class Hooks {

    DriverFactory df = new DriverFactory();
    public static Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario) throws MalformedURLException, InterruptedException{
        this.scenario = scenario;
        df.createDriver();
        System.out.println(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } finally {
                df.teardown();
        }
    }

}