@RunAll
Feature: Test Diffrent Methods
	
	@newWindow
	Scenario: Windows Handler
		When Click On Try Yourself
		Then New Window Opens where title is "Tryit Editor v3.0"
		And Close the current window
		And Switch to default window where title is "HTML Iframes"
		
	
	@TestCucumber
	Scenario: Test Cucumber
		When Run my test
		
		