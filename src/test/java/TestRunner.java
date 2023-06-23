import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDef",
        plugin = {
                "json:target/json/cucumber.json",
                "html:target/cucumber.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
