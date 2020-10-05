package RunnerCode;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"src/test/resources/Features/Submenu.feature"}
 ,glue={"src/test/java/AmazonStepDef","src/test/java/factoryPage"}
 )
 
public class TestRunner {
 
}
