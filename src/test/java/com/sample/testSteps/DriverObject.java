/**
 * 
 */
package com.sample.testSteps;

import com.sample.utilities.WebDriverConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author arafatmamun
 *
 */
public class DriverObject{
	
	@Before
	public void createDriverObject() throws Exception {
		
		WebDriverConfig.openDriver();
	}

	@After
	public static void terminateDriverObject() {
		WebDriverConfig.closeDriver();
	}
}
