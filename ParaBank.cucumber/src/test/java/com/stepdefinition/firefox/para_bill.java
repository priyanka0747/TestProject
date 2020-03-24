package com.stepdefinition.firefox;

import com.pages.Para_Billpay_page;

import BaseClass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class para_bill extends WrapperClass{
	
	Para_Billpay_page pbp;
	@Given("^the user launch the chrome$")
	public void the_user_launch_the_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		pbp= new Para_Billpay_page(driver);
		throw new PendingException();
	}

	@When("^the user open the Parabank Login Page$")
	public void the_user_open_the_Parabank_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getUrl();
	    throw new PendingException();
	}

	@Then("^the user login to the account$")
	public void the_user_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pbp.customerLogin();
	    throw new PendingException();
	}

	@And("^the user fills the details of the bill pay$")
	public void the_user_fills_the_details_of_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pbp.customerBillPay();
	   throw new PendingException();
	}

	@And("^submit the bill pay$")
	public void submit_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pbp.submitBillPay();
	    throw new PendingException();
	}


}
