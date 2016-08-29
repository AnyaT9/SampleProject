/**
 * 
 */
package com.sample.testSteps;

import com.sample.utilities.PageObjectsHandler;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author arafatmamun
 *
 */
public class TC001Steps extends PageObjectsHandler{
	
	@Given ("^On Price Line Home and Page Title \"([^\"]*)\".$")
	public void verifyHomePageTitle(String title){

		home().verifyPageTitle(title);
	}
	
	@Then("^Verify text \"([^\"]*)\" on Hotels Link$")
	public void verifyHotelsLinksText(String linkText){
		
		header().verifyHotelsLinkText(linkText);
	}
	
	@When ("^Click on hotels link$")
	public void clickOnHotelsLink(){
		
		header().clickOnHotelsLink();
	}
	
	@Then("^Verify Hotels Landing Page Where Page Title \"([^\"]*)\".$")
	public void verifyHotelsLandingTitle(String title){
		
		hotels().verifyPageTitle(title);
	}
}
