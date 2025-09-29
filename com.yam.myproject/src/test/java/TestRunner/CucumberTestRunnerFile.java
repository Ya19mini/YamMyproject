package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles",
		// Path to your feature files
		
        glue = {"StepDefinitions"}, 
        // Path to your step definition package
        
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty.html", "json:target/cucumber-reports/CucumberTestReport.json"},
        monochrome = true
        
       // tags = "@SmokeTest" 
        // Optional: run specific tags
    )

public class CucumberTestRunnerFile extends AbstractTestNGCucumberTests {
	/* extends AbstractTestNGCucumberTests: This is crucial for integrating Cucumber with TestNG. 
		It provides the necessary TestNG hooks to execute Cucumber scenarios.
   */
			
	}
