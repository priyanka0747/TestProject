package com.stepdefinition;

import com.pages.para_login_pages;

import BaseClass.WrapperClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Para_Login extends WrapperClass{
	
	para_login_pages lp;
	
	
	  @Given("^the user launch the chrome browser$") 
	  public void
	  the_user_launch_the_chrome_browser() throws Throwable { // Write code here  that turns the phrase above into concrete actions 
		  launchBrowser("chrome");
		  lp=new para_login_pages(driver);
		  throw new PendingException();
		  }
	  
	  @When("^the user open the Parabankpage$") 
	  public void  the_user_open_the_Parabankpage() throws Throwable { // Write code here that turns the phrase above into concrete actions 
	  getUrl();
	  throw new PendingException();
	  
	  }
	 
	@Then("^enter username$")
	public void enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lp.enterUsername();
	    throw new PendingException();
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lp.enterPassword();
	   throw new PendingException();
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lp.logInButton();
	    throw new PendingException();
	}

}
