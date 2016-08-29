/**
 * 
 */
package com.sample.pageObjects;

import com.sample.utilities.MethodsHandler;

/**
 * @author arafatmamun
 *
 */
public class Header extends MethodsHandler{
	
	private String hoteslLink = ".//*[@id='global-header-nav-section']/descendant::a[2]";
	private String carsLink = ".//*[@id='global-header-nav-section']/descendant::a[3]";
	private String flightslLink = ".//*[@id='global-header-nav-section']/descendant::a[4]";
	private String PackageslLink = ".//*[@id='global-header-nav-section']/descendant::a[5]";
	private String crusesLink = ".//*[@id='global-header-nav-section']/descendant::a[6]";
	
	
	/*
	 * Verify Hotles Link Text
	 */
	public void verifyHotelsLinkText(String linkText){
		compare().assertValue(linkText, getXpath(), hoteslLink);
	}
	
	/*
	 * Click On Hotels Header Link
	 */
	public void clickOnHotelsLink(){
		
		click().clickOnElement(getXpath(), hoteslLink);
	}
	
	/*
	 * Click On Cars Header Link
	 */
	public void clickOnCarsLink(){
		
		click().clickOnElement(getXpath(), carsLink);
	}
	
	
}
