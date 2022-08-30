package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/dynamicfeature",
        plugin = {"pretty", "json:target/cucumber-json-reports/report.json", "junit:target/cucumber-xml-reports/report.xml"})
public class RunCucumberTest {
}
