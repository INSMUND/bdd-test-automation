package stepDefinitions;

import org.apache.log4j.Logger;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.TestContext;

public class Hooks {
	TestContext testContext;
	private static Logger log = Logger.getLogger(Hooks.class);

	 
	 public Hooks(TestContext context) {
	 testContext = context;
	 }
	 
	 @Before
	 public void before(Scenario scenario) {
		    log.info("------------------------------");
		    log.info("Starting - " + scenario.getName());
		    log.info("------------------------------");
		}
	
	 
	 
	 @After
	 public void AfterSteps() {
	 testContext.getWebDriverManager().quitDriver();
	 }
	 
	}


