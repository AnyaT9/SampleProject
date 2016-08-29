/**
 * 
 */
package com.sample.activities;

import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * @author arafatmamun
 *
 */
public class ClickMethods extends FindMethods{
	
	/*
	 * Perform Click On an Element
	 * * Parameters:
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 */
	public void clickOnElement(String locator, String attributeOfLocator){	
		
		try{
		    WebElement myElement = getElement(locator, attributeOfLocator);
		    myElement.click();	
			
		} catch(NoSuchElementException exc){
			Assert.fail("No Such Element Execption!");
		} catch(NullPointerException exc){
			Assert.fail("Null Pointer Exception!");
		}  catch(TimeoutException exc){
			Assert.fail("Time Out Execption!");
		}
	}
}
