/**
 * Iftheker
 */
package com.sample.pageObjects;

import com.sample.utilities.KeyHandler;
import com.sample.utilities.MethodsHandler;
import com.sample.activities.InputMethod;
import com.sample.activities.ClickMethods;
import com.sample.activities.DatePicker;


public class Cars extends MethodsHandler{
	
	/*
	 * Iftheker
	 *
	 */
	
	private String airPortName = ".//*[@id='pickUpSearchString']";
	private String clickairPortName = ".//*[@id='ui-active-menuitem']";
//	private String clickAgainairPortName = ".//*[@id='ui-active-menuitem']";
	private String clickOnPickupDate = ".//*[@id='pickUpDate']";
	private String SelectPickupDate = ".//*[@id='ui-datepicker-div']";
	private String clickOnDropoffDate = ".//*[@id='dropOffDate']";
	private String clickOnPickupTime = ".//*[@id='pickUpTime']";
	private String clickOnDropoffTime = ".//*[@id='dropOffTime']";
	private String clickOnSearchCars = ".//*[@id='car-btn-submit-retl']";
	
	
	private String [] calender = null;
	
	public void verifyPageTitle(String title){
		compare().assertTitle(title);
	}
	
	
	private KeyHandler kh = null;
	public Cars(){
		kh = new KeyHandler();
	}
	
	
	/*
	 * Enter First Name In Account Registration Page
	 * Iftheker_Zaman
	 * 8-26-2016 
	 */
	public void airPortName(String value ){
		inputMethod().sendInputKeys(getXpath(), airPortName, value);
	}


	/*
	 * 
	 * Iftheker
	 * 
	 */
	
	public void clickairPortName(){
		
		click().clickOnElement(getXpath(), clickairPortName);
	}
	
	public void clickairPortNameAgain(){
		
		click().clickOnElement(getXpath(), clickairPortName);
	}

	
	public void clickOnPickupDate(){
		
			click().clickOnElement(getXpath(), clickOnPickupDate);
		}
	
	
	public void SelectPickupDate(String dValue){		
		datePickerMethods().getSelectedDate(kh.isVisible(),calender,dValue,10,kh.no());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
