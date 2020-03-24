package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\javacoding\\ParaBank.cucumber\\feature\\Parabank.feature",		
		glue = {"com.stepdefinition.firefox"}		
		)


public class Para_firefoxRunnerClass extends AbstractTestNGCucumberTests{

}
