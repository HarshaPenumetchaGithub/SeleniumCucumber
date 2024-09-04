package com.hyd.stepdefinition;

import com.hyd.base.*;
import com.hyd.pageobjects.*;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTests extends Initialization {
	
	HomePage homePage = new HomePage();;
	FriendsPage friendsPage = new FriendsPage();
	
	@Then("Home page is displayed")
	public void verifyHomePageTitle() {
		homePage.verifyHomePageTitle();
	}
	
	@When("User navigates to friends page")
	public void verifyNavigationToFriends() {
		homePage.navigateToFriends();
	}
	
	@Then("Friends page is displayed")
	public void verifyFriendsPageTitle() {
		friendsPage.verifyFriendsPageTitle();
	}
}