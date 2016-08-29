/**
 * 
 */
package com.sample.testSteps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sample.utilities.WebDriverConfig;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author arafatmamun
 *
 */
public class DemoSteps {
	
	int a;
    int b;
    int sum;
    WebDriver myDriver = null;
    
    @Given("^first digit (\\d+)$")
    public void firstDigit(int digit) throws Throwable {
        a = digit;
    }

    @And("^second digit (\\d+)$")
    public void secondDigit(int digit) throws Throwable {
        b = digit;
        
    }

    @When("^I multiply it$")
    public void multiply() throws Throwable {
        sum = a + b;
    }

    @Then("^sum is (\\d+)$")
    public void sum(int result){
        Assert.assertEquals(result, sum);
    }
}
