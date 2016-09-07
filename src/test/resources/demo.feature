@Regrassion
@Multiply
Feature: Test allure English
	
	@RunOne
  	Scenario: Test multiply
	    Given first digit 5
	    And second digit 5
	    When I multiply it
	    Then sum is 10
	
	@RunMultiple 
  	Scenario Outline: Two digits multiply
	    Given first digit <first>
	    And second digit <second>
	    When I multiply it
	    Then sum is <sum>
	    Examples: 
	      | first | second | sum |
	      |     6 |      6 |  14 |
	      |     5 |     10 |  15 |
	      |     7 |      9 |  16 |
	