package com.sample.testRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * 
 */

/**
 * @author arafatmamun
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@Header"},
		features = {"src/test/resources/"},
		glue ="com/sample/testSteps"
		)
public class runTest {

}
