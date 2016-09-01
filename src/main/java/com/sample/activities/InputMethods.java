package com.sample.activities;

import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputMethods extends FindMethods{
	
	public void inputMethods(){
		
		
	}
	public void enterData(String Locator, String AttributeLocator, String value){
		WebElement ele;
		try {
			ele = getElement(Locator, AttributeLocator);
			ele.sendKeys(value);
		} catch(NoSuchElementException exc){
			Assert.fail("No Such Element Execption!");
		} catch(NullPointerException exc){
			Assert.fail("Null Pointer Exception!");
		}  catch(TimeoutException exc){
			Assert.fail("Time Out Execption!");
		}
		
	}
	
}
