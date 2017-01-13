package com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions;

        import java.net.MalformedURLException;

        import com.DoclerTestSite.CucumberAutomation.utils.DriverFactory;

        import cucumber.api.java.After;
        import cucumber.api.java.Before;

public class Hooks {

    DriverFactory df = new DriverFactory();

    @Before
    public void beforeScenario() throws MalformedURLException, InterruptedException{

        df.createDriver();
    }

    @After
    public void afterScenario(){
        df.teardown();
    }
}