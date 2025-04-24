package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinitions","Hooks"},
        //tags = "@regression",
        publish = false,
        plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-reports.html" }

)
public class Run extends AbstractTestNGCucumberTests {
    //and or not
}



