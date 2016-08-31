package com.sample.activities;

import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class InputMethod extends FindMethods{
	
	/* Enter Data Into Field
	 * Ataul
	 * 8-11-2016 16:40
	 */
	
	//public FindMethods fm = null;
	
	/*
	 * This constructor creates findmethods object to get different find elements using methods in it.
	 * Ataul
	 * 8-16-2016 13:05
	 */
	public InputMethod(){
		
		//fm = new FindMethods();		
	}
	
	/*
	public  WebElement findDynamicElement(By by, int timeOut) {
	    WebDriverWait wait = new WebDriverWait(myDriver, timeOut);
	    WebElement elementt = wait.until(ExpectedConditions.presenceOfElementLocated(by));//.elementToBeClickable(by));
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    return elementt;
}
	
	
	/*
	 * 
	 * This method locate the input elements and send keys to it.
	 * Iftheker
	 */
	public void sendInputKeys(String locator, String attributeOfLocator, String message) {
		
		try{
			WebElement element = getElement(locator, attributeOfLocator);
			element.sendKeys(message);
		} catch(NoSuchElementException exc){
			Assert.fail("No Such Element Execption!");
		} catch(NullPointerException exc){
			Assert.fail("Null Pointer Exception!");
		}  catch(TimeoutException exc){
			Assert.fail("Time Out Execption!");
		}
	}		

	
	
	
	
	
	
	
	/*
	 * 
	 * This method finds the elements needed extra time to be visible in DOM and then send keys to it
	 * 
	 * Ataul
	 * 8-16-2016 13:11
	 */
	/*public void sendInputKeys(String elementStatus, String locator, String attributeOfLocator,int waitTime,String message){
		
		try{
			WebElement element = fm.getElement(elementStatus, locator, attributeOfLocator, waitTime);	
			element.sendKeys(message);
			
		} catch(NoSuchElementException e){
			
			System.out.println("***** No Such Element found !!! ");
		}
		
	}*/
}