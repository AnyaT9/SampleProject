/**
 * 
 */
package com.sample.pageObjects;

import com.sample.utilities.MethodsHandler;

/**
 * @author arafatmamun
 *
 */
public class Hotels extends MethodsHandler{
	
	/*
	 * Verify Page Title
	 */
	public void verifyPageTitle(String title){
		compare().assertTitle(title);
	}
}
