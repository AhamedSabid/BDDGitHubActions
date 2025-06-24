package org.example;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

//@RunWith(Cucumber.class)
@CucumberOptions(glue = "org.example", features = "src/test/java", tags = "@scenarionOutline",
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/failedrerun.txt"})

public class RunnerClass extends AbstractTestNGCucumberTests {

    @AfterClass
    public void tearDown(){

        BasePage.driver.quit();
    }
}




