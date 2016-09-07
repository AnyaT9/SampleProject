/**
 * 
 */
package com.sample.pageObjects;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.sample.utilities.MethodsHandler;

/**
 * @author arafatmamun
 *
 */
public class Header extends MethodsHandler{
	
	private String allLinks = "//*[@id='global-header-nav-section']/descendant::li";
	private String hoteslLink = "//*[@id='global-header-nav-section']/descendant::a[2]";
	private String carsLink = "//*[@id='global-header-nav-section']/descendant::a[3]";
	private String flightslLink = "//*[@id='global-header-nav-section']/descendant::a[4]";
	private String PackageslLink = "//*[@id='global-header-nav-section']/descendant::a[5]";
	private String crusesLink = "//*[@id='global-header-nav-section']/descendant::a[6]";
	
	/*
	 * Verify All Hotels Header Link
	 */
	public void verifyAllHeaderLinks(){
		try {
			List < WebElement > myElements = find().getElements(getXpath(), allLinks);
			
			ListIterator< WebElement > it = myElements.listIterator();
			
			while(it.hasNext()){
				WebElement myElement = it.next();
				
				System.out.println(myElement + "   " +myElement.getText() );
				//myElement.click();
				Thread.sleep(1000);
			}
			
		} catch (TimeoutException e) {
			Assert.fail("Unable to get element");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
