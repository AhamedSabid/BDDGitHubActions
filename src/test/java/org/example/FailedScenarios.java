package org.example;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failedrerun.txt",
        glue = "org.example",
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/failedrerun.txt"}
)
public class FailedScenarios extends AbstractTestNGCucumberTests {
    @AfterClass
    public void tearDown() {

        BasePage.driver.quit();

    }
}
