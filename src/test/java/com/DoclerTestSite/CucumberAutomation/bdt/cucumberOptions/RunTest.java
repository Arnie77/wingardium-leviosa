package com.DoclerTestSite.CucumberAutomation.bdt.cucumberOptions;

import com.DoclerTestSite.CucumberAutomation.web.function.ErrorMethod;
import com.DoclerTestSite.CucumberAutomation.web.pages.FormPage;
import com.DoclerTestSite.CucumberAutomation.web.pages.HomePage;
import com.DoclerTestSite.CucumberAutomation.web.pages.NavigationBar;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/com/DoclerTestSite/CucumberAutomation/bdt/features",
        glue = "com.DoclerTestSite.CucumberAutomation.bdt.stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber",
        }
)
public class RunTest {

        public static NavigationBar navigationBar = new NavigationBar();
        public static HomePage homePage = new HomePage();
        public static FormPage formPage = new FormPage();
        public static ErrorMethod errorMethod = new ErrorMethod();

}
