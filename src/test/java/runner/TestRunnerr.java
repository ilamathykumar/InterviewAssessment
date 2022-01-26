package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		//feature - where all filer are located
		//glue - StepDefinition  classes are located
		
		//DryRun checks if there are any missing steps in StepDefinitions class
				//strict will mark scenario failed if there are any pending steps.
		//PlugIn -- for generating a readable report
		features = "classpath:features",
		glue = "stepDefinitions",
		tags = "@smokeTest",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {
					"pretty", 
					"html:target/site/cucumber-pretty",
					"json:target/cucumber.json" }, 
		publish = true
		)
public class TestRunnerr {
	/**
	 * This method will invoke the Cucumber reporting once the execution is over.
	 * @AfterClass annotation is from Junit and this will run after (AfterHooks)
	 */
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();

}
}