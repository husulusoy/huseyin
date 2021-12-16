package guru99.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "guru99.stepsDefinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-report.html",
        "json:target/cucumber_json.json",
        "rerun:target/rerun.txt"}

)


public class TestRunner {
}
