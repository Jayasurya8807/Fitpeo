package org.stepdefinitions;

import org.base.classes.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void preCondition() {

		browserLaunch("Edge");
	}
	
	
	@After
	private void postCondition(Scenario s) {

		closeBrowser();
	}
	

}
