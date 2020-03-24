package com.stepdefinition;

import com.pages.Para_Registration_page;

import BaseClass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Para_Registration extends WrapperClass{
	
Para_Registration_page prp;	
	


	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("chrome");
		 prp= new Para_Registration_page(driver);
		 throw new PendingException();
	}

	@When("^the user open the Parabank Registration page$")
	public void the_user_open_the_Parabank_Registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   getUrl();
	   throw new PendingException();
	}

	@Then("^user gives the details$")
	public void user_gives_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    prp.registrationOfCustomer();
	    throw new PendingException();
	}

	@Then("^click on the Register button$")
	public void click_on_the_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    prp.submitRegistration();
	    throw new PendingException();
	}


}
