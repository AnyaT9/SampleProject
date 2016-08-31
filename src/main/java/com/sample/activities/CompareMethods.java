/**
 * 
 */
package com.sample.activities;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;


/**
 * @author arafatmamun
 *
 */
public class CompareMethods extends FindMethods{
	
	/*
	 * Method to Compare Two Value
	 */
	public void assertValue(String expected, String locator, String attributeOfLocator) {
		
		try {
			String actual = getElement(locator, attributeOfLocator).getText();
			Assert.assertEquals(expected, actual);
			
		} catch(NoSuchElementException exc){
			
		} catch(NullPointerException exc){
			Assert.fail("Null Pointer Exception!");
		} catch( AssertionError exc){
			Assert.fail("Assertion Error!");
		}
	}
	
	
	/*
	 * 
	 */
	public void assertTitle(String expected){
		
		try {
			String actual = myDriver.getTitle();
			Assert.assertEquals(expected, actual);
			
		} catch(NoSuchElementException exc){
			
		} catch(NullPointerException exc){
			Assert.fail("Null Pointer Exception!");
		} catch( AssertionError exc){
			Assert.fail("Assertion Error!");
		}
		
	}
}
