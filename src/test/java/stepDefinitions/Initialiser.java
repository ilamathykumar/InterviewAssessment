package stepDefinitions;
import core.Basee;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initialiser extends Basee {
	
	@Before
	public void beforHooks(Scenario scenario) {
		logger.info("Scenario" +scenario.getName() + " started");
		browser();
		openBrowser();
	} 
	
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario " + scenario.getName() + " "+scenario.getStatus());
	}

}
