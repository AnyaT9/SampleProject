package com.sample.testSteps;

import com.sample.utilities.PageObjectsHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class FlightTestSteps extends PageObjectsHandler {
	
	@When ("^Click on header link Flights from Home screen$")
	public void clickOnHeaderLinkFlights(){
		header().clickOnHeaderLinkFlight();
	}
	
	@And ("^Click on Radio button One-Way$")
	public void clickOnOneWay(){
		flights().clickOnOneWay();
	}
	
	@And ("^Enter \"([^\"]*)\" as Destination$")
	public void enterDestination(String enterValue){
		flights().enterDepartingCityOrAirport(enterValue);
	}
	
	@And ("^Enter \"([^\"]*)\" as Arrival city$")
	public void enterArrivalCity(String enterValue){
		flights().enterarrivingCityOrAirport(enterValue);
	}
	

}
