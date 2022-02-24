package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src/test/resources/features/", glue = "glue", plugin = { "pretty","json:target/cucumber-reports/cucumber.json" }, monochrome = true, tags = "@localtest", dryRun = false, snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
