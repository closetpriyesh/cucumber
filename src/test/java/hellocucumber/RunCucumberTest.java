package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/dynamicfeature",
        plugin = {"pretty", "json:target/cucumber-json-reports/report.json"})
public class RunCucumberTest {
}
