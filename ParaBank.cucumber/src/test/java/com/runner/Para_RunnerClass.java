package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\javacoding\\ParaBank.cucumber\\feature\\Parabank.feature",		
		glue = {"com.stepdefinition"}		
		)

public class Para_RunnerClass extends AbstractTestNGCucumberTests {
}
	

