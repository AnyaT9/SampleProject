package com.sample.activities;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class InputMethods extends FindMethods{
	
	/*
	 * 
	 * This method locate the input elements and send keys to it.
	 * Ataul
	 * 8-16-2016 13:09
	 */
	public void sendInputKeys(String locator, String attributeOfLocator, String enterValue) {
		
		try{
			WebElement element = getElement(locator, attributeOfLocator);
			element.sendKeys(enterValue);
		} catch (NoSuchElementException e){

			if(e != null){
				
				Assert.fail("*** No Such Element Found ***");
				
				
			}
		}		
	}
	
	
	
}
