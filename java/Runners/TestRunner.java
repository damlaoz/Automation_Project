package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = {"src/test/java"},
        glue = {"Steps"},
        plugin = {"pretty","html:target/site/cucumber-pretty",
        "json:target/cucumber.json","html:target/cucumber-html-report",
        "usage:target/cucumber-usage.json",""+"junit:target/cucumber-results.xml"},
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
