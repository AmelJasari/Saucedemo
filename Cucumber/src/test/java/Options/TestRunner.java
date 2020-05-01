package Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		//ako zelimo da pokrenemo sve "features-e" samo upisemo putanju do paketa
		features = {"src/test/java/features/LoginApp.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty", "html:target/cucumber",
				"json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/cucumber-report.html"
				
		}
		
		
		)


public class TestRunner {
	



}
