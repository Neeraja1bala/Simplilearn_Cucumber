package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        
		monochrome = true,
		plugin= {"pretty","html:target/cucumber-html","json:target/cucumber.json"},
        features = "src/test/java/features",
        
        //tags= {"@Regression","@Sanity"}, //and condition
        //tags= {"@Regression,@Sanity"}, //or condition
        //tags= {"~@DataTable"}, //to ignore scenario
        
        tags= {"@Regression"},
        glue= {"stepdefs"}
 )
public class TestRunner {

}
