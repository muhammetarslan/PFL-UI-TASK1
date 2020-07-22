package runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue ="step_definitions",
    features = "src/test/resources",
    dryRun = false,
    tags = "@numbersequencefinder",
    plugin ={
                "html:target/default-report",
                "json:target/cucumber1.json"
    }

)
public class CucumberRunner {
}
