package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.generate.Jvm_Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", 
                 glue="org.stepdefinitions", 
                 monochrome=true,
                 plugin = {"html:target\\HtmlReport", "json:target\\JsReport\\JsRepo.json"})
public class TestRunner {
	
	@AfterClass
	public static void reportGen() {

		Jvm_Report.jvmReportGeneration("C:\\Users\\jayas\\OneDrive\\Documents\\Fitpeo\\Fitpeo\\target\\JsReport\\JsRepo.json");
	}

}
