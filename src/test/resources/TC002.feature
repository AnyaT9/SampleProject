@Header
@Regrassion
Feature: Verify Header Options
	
	@Cars
	Scenario: Verify Cars Link
		Given On Price Line Home and Page Title for cars "Priceline.com - The Best Deals on Hotels, Flights and Rental Cars.".
		Then Verify text "Cars" on car Link
		When Click on cars link
		Then Verify car rental Page Where Page Title "Cheap Rental Cars: Airport Car Rental Deals | Priceline".
		And Enter "london" as AirPort Name
		And Click on Airport Name
		And Click on Pick Up Date
		And Select "09/20/2016" as Pick-Up-Date