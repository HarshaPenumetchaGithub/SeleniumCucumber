package com.hyd.stepdefinition;

import com.hyd.base.*;
import com.hyd.pageobjects.*;

import io.cucumber.java.en.*;

public class LoginPageTests extends Initialization {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("Login page is displayed")
	public void initialize() {
		setup("Chrome");
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@Then("Login page title is displayed")
	public void verifyLoginPageTitle() {
		loginPage.verifyTitle("Facebook – log in or sign up");
	}
	
	@When("User logs in")
	public void userLogin() {
		loginPage.Login(username, password);
	}
	
	@And("Close Browser")
	public void closure() {
		teardown();
		
		// calling garbage collector
		System.gc();
	}
}
