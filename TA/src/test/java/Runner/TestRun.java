package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = "src/test/resources/Features", strict=true, glue="TestLogin", 
        		plugin = {"pretty","html:target/cucumber-report.html","json:target/Connexion.json"}
        
  )     
public class TestRun {

}