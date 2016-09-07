/**
 * 
 */
package com.sample.activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver.TargetLocator;

import com.sample.utilities.WebDriverConfig;

/**
 * @author arafatmamun
 *
 */
public class WindowHandlerMethods extends WebDriverConfig{
	
	List< String > listOfHandles = null;
	
	/*
	 * Constructor
	 * Getting all the windows at the time of Construction
	 */
	public WindowHandlerMethods(){
		
		Set< String > handles = myDriver.getWindowHandles();
		listOfHandles = new ArrayList< String >(handles);
	}
	
	
	/*
	 * Switch To Specific Window
	 */
	public void switchToWindow(int windowIndex){
		
		TargetLocator targetWindow = myDriver.switchTo();
		targetWindow.window( listOfHandles.get(windowIndex));
		//System.out.println(listOfHandles);
	}
	
	/*
	 * Close Specific Window Window
	 */
	public void closeWindow( int windowIndex ){
		myDriver.close();
		listOfHandles.remove(windowIndex);
		//System.out.println(listOfHandles);
	}
}
