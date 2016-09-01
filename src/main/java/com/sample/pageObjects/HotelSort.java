package com.sample.pageObjects;

import com.sample.utilities.MethodsHandler;

public class HotelSort extends MethodsHandler{
	private String clickHotel = ".//*[@id='global-header-nav-section']/ul/li[1]/a";
	private String enterCityName = ".//*[@id='hotel-dest']";
	private String clickSearch = ".//*[@id='hotel-btn-submit-retl']";
	
	public void clickOnHotel(){
		click().clickOnElement(getXpath(), clickHotel);
	}
	
	public void enterCityName( String value ){
	input().enterData(getXpath(), enterCityName, value);
	
	//inputMethods().getElement(getXpath(), enterCityName);
	}
	
public void clickOnSearch(){
		
		click().clickOnElement(getXpath(), clickSearch);
	}

}
