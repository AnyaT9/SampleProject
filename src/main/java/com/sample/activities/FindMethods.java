/**
 * 
 */
package com.sample.activities;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.sample.utilities.WebDriverConfig;

/**
 * @author arafatmamun
 *
 */
public class FindMethods extends WebDriverConfig{
	
	
	/*
	 * Find Specific Element for Web Page
	 * * Parameters:
	 * 		locator : id / classname / name / xpath / css / link text of element to be found
	 * 		attributeOfLocator : locator string
	 */
	public  WebElement getElement(String locator, String attributeOfLocator){
		
		WebElement myElement = null;
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(myDriver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
		
        myElement = wait.until(new Function<WebDriver, WebElement>() {
        	
            public WebElement apply(WebDriver driver) {
            	
            	WebElement element = null;
            	if(locator.equalsIgnoreCase("id"))
            		element = driver.findElement(By.id(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("className"))
        			element = driver.findElement(By.className(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("name"))
        			element = driver.findElement(By.name(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("xpath"))
        			element = driver.findElement(By.xpath(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("css"))
        			element = driver.findElement(By.cssSelector(attributeOfLocator));
        		else if(locator.equalsIgnoreCase("linkText"))
        			element = driver.findElement(By.linkText(attributeOfLocator));
                return element;
            }
        });
        
        return myElement;
	}
}
