package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/Courses",
        glue = {"StepDefinitions","Hooks"},
     //  tags = "@richa",
        publish = false,
        plugin = {"pretty", "json:target/cucumber-report.json","html:target/cucumber-report.html" }

)
public class Run extends AbstractTestNGCucumberTests {
    //and or not
}
