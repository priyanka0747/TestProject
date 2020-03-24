package com.stepdefinition.firefox;

import com.pages.Para_MessageToCustomer_page;

import BaseClass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class para_message extends WrapperClass {
	
Para_MessageToCustomer_page pmp;
	
	@Given("^the user launchs the chrome browser$")
	public void the_user_launchs_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		pmp= new Para_MessageToCustomer_page(driver);
		throw new PendingException();
	}

	@When("^the user open the Parabank HomePage$")
	public void the_user_open_the_Parabank_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	    throw new PendingException();
	}

	@Then("^the user opens the msg and fill the details$")
	public void the_user_opens_the_msg_and_fill_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pmp.fillMessageDetails();
	    throw new PendingException();
	}

	@And("^send the message to customer care$")
	public void send_the_message_to_customer_care() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pmp.sendMessage();
	   throw new PendingException();
	}

	
	

}
