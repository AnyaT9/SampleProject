/**
 * 
 */
package com.sample.testSteps;

import java.util.concurrent.TimeoutException;

import com.sample.utilities.PageObjectsHandler;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Iftheker
 *
 */
public class TC002Steps extends PageObjectsHandler{
	
	@Given ("^On Price Line Home and Page Title for cars \"([^\"]*)\".$")
	public void verifyHomePageTitle(String title){

		home().verifyPageTitle(title);
	}
	
	@Then("^Verify text \"([^\"]*)\" on car Link$")
	public void verifyCarsLinkText(String linkText){
		
		header().verifyCarsLinkText(linkText);
	}
	
	@When ("^Click on cars link$")
	public void clickOnCarsLink(){
		
		header().clickOnCarsLink();
	}
	
	@Then("^Verify car rental Page Where Page Title \"([^\"]*)\".$")
	public void verifyHotelsLandingTitle(String title){
		
		cars().verifyPageTitle(title);
	}
	
	
	@When("^Enter \"([^\"]*)\" as AirPort Name$")
	public void airPortName(String airPortName) {
		cars().airPortName(airPortName);
	}
	
	@When("^Click on Airport Name$")
	public void clickairPortName(){
		cars().clickairPortName();
	}
	
	@When("^Click on Airport Name again$")
	public void clickairPortNameAgain(){
		cars().clickairPortNameAgain();
	}
	
	
	@When("^Click on Pick Up Date$")
	public void clickOnCheckInField(){
		cars().clickOnPickupDate();
	}
	
	@When("^Select \"([^\"]*)\" as Pick-Up-Date$")
	public void SelectPickupDate(String SelectPickupDate){
		cars().SelectPickupDate(SelectPickupDate);
	}
	
}
