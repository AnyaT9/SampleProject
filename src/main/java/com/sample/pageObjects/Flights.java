package com.sample.pageObjects;

import com.sample.utilities.MethodsHandler;

public class Flights extends MethodsHandler {
	
	private String radioButtonFlightOnly = ".//*[@id='vp-options-air-radio-air']";
	private String radioButtonFlightHotel = ".//*[@id='vp-options-air-radio-airhotel']";
	private String radioButtonFlightHotelCar = ".//*[@id='vp-options-air-radio-airhotelrc']";
	private String radioButtonRoundTrip = ".//*[@id='AirTripTypeRT']";
	private String radioButtonOneWay = ".//*[@id='AirTripTypeOW']";
	private String radioButtonMultiDestination = ".//*[@id='AirTripTypeMD']";
	
	private String inputFieldFrom = ".//*[@id='air-loc-from']";
	private String inputFieldTo = ".//*[@id='air-loc-to']";
//	private String datePickerDepart = ".//*[@id='departure-from']";
//	private String datePickerReturn = ".//*[@id='return-date']";
//	
//	private String dropDownBoxAdults = ".//*[@id='adult-passengers']";
//	private String dropDownBoxChildren = ".//*[@id='child-passengers']";
//	
//	private String searchFlightsButton = ".//*[@id='air-submit-btn']";
//	
//	private String checkBoxMoreOptions = ".//*[@id='flights-option']";
//	private String dropDownBoxCabinClass = ".//*[@id='air-cabin-class']";
//	private String inputFieldAirline = ".//*[@id='air-carrier']";
//	private String alternateDepartureDate = ".//*[@id='flex-departure']";
//	private String alternateReturnDate = ".//*[@id='flex-return']";
//	private String nonStopFlightsOnly = ".//*[@id='air-non-stop']";
//	private String unRestrictedFaresOnly = ".//*[@id='unrestricted-fares']";
//	
//	private String closeFlightOptionPanel = ".//*[@id='close-option-panel']";
	
	/*
	 * clicking on radio button "Flight Only"
	 */
	
	public void clickFlightOnly(){
		click().clickOnElement(getXpath(), radioButtonFlightOnly);
	}
	
	/*
	 * Clicking on radio button "Flight + Hotel"
	 * 
	 */
	
	public void clickOnFlightHotel(){
		click().clickOnElement(getXpath(), radioButtonFlightHotel);
	}
	
	/*
	 * Clicking on radio button "Flight + Hotel + Car"
	 */
	
	public void clickOnFlightHotelCar(){
		click().clickOnElement(getXpath(), radioButtonFlightHotelCar);
	}
	
	/*
	 * Clicking on radio button "Round Trip"
	 */
	
	public void clickOnRoundTrip(){
		click().clickOnElement(getXpath(), radioButtonRoundTrip);
	}
	
	/*
	 * Clicking on radio button "One-Way"
	 */
	
	public void clickOnOneWay(){
		click().clickOnElement(getXpath(), radioButtonOneWay);
	}
	
	/*
	 * Clicking on radio button "Multi-Destination"
	 */
	
	public void clickOnMultiDestination(){
		click().clickOnElement(getXpath(), radioButtonMultiDestination);
	}
	
	/*
	 * Clicking and entering input in "From" field
	 */
	
	public void enterDepartingCityOrAirport(String enterValue){
		input().sendInputKeys(getXpath(), inputFieldFrom, enterValue);
	}
	
	/*
	 * Clicking and entering input in "To" field
	 */
	
	public void enterarrivingCityOrAirport(String enterValue){
		input().sendInputKeys(getXpath(), inputFieldTo, enterValue);
	}
	
	/*
	 * selecting a departing date using DatePicker method
	 */
	
	public void selectDapartingDate(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
