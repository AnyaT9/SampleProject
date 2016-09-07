/**
 * 
 */
package com.sample.testSteps;

import com.sample.utilities.MethodsHandler;
import com.sample.utilities.PageObjectsHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author arafatmamun
 * Breaking the rule of Page object model to test Methods
 */
public class TestSteps extends MethodsHandler{

	@When("^Click On Try Yourself$")
	public void click_On_Try_Yourself(){
	    click().clickOnElement(getXpath(), ".//*[@id='main']/div[8]/a");
	}

	@Then("^New Window Opens where title is \"([^\"]*)\"$")
	public void new_Window_Opens_where_title_is(String pageTitle){
		windowHandler().switchToWindow(1);
		compare().assertTitle(pageTitle);
	}
	
	@And("^Close the current window$")
	public void clos_the_current_window(){
		windowHandler().closeWindow(1);
	}
	
	@And("^Switch to default window where title is \"([^\"]*)\"$")
	public void clos_the_current_window(String pageTitle){
		windowHandler().switchToWindow(0);
		compare().assertTitle(pageTitle);
	}
}
