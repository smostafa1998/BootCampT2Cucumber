import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/example.feature"},
        glue = {"step_definitions"},
//    tags = "@Deals",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
public class AirBnBTestRunner {

}