package com.stepdefinition.firefox;

import com.pages.Para_admin_page;

import BaseClass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class para_admin extends WrapperClass {
	
Para_admin_page pa;
	
	@Given("^the user launch the chromebrowser$")
	public void the_user_launch_the_chromebrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		pa= new Para_admin_page(driver);
		throw new PendingException();
	}

	@When("^the user open the Parabank Homepage$")
	public void the_user_open_the_Parabank_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	    throw new PendingException();
	}

	@Then("^the user select the Admin Page$")
	public void the_user_select_the_Admin_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pa.selectAdminpage();
	   throw new PendingException();
	}

	@And("^the user submits the Administration Page$")
	public void the_user_submits_the_Administration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pa.submitAdministration();
	    throw new PendingException();
	}


}
