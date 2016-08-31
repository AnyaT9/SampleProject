package com.sample.activities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethods extends FindMethods{
	
	/*
	 * This method locate Select drop down elements and then select user input from paramaeter list.
	 * Ataul
	 * 8-16-2016 13:55
	 */		
			
	public void selectFromDropDownList(String locator,String attributeOfLocator,String value){
		
		try{			
			WebElement element = getElement(locator, attributeOfLocator);
			Select  dvalue = new Select(element);
			dvalue.selectByVisibleText(value);
		} catch(NoSuchElementException e){
			
			System.out.println("***** No Such Element Found ***** ");
		}			
	}
	
	
	
	
}