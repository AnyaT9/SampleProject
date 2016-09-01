package com.sample.testSteps;



import com.sample.utilities.PageObjectsHandler;

import cucumber.api.java.en.When;
/**
 * @author arko
 *
 */
public class TC_10_Steps extends PageObjectsHandler{
	
	@When("^Click on Hotel link from HotelSort$")
	public void clickOnHotel(){
		sort().clickOnHotel();
	}
	@When("^Enter \"([^\"]*)\" as valid City$")
	public void enterCityName(String enterCityName){
		sort().enterCityName(enterCityName);

	}
	@When("^Click on Search for Hotels$")
	public void clickOnHotelsLink(){
		sort().clickOnSearch();
		
	}

}
