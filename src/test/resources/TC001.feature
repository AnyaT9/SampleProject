@Header
@Hotels
@Regrassion
Feature: Verify Header Options
	Scenario: Verify Hotels Link
		Given On Price Line Home and Page Title "Priceline.com - The Best Deals on Hotels, Flights and Rental Cars.".
		Then Verify text "Hotels" on Hotels Link
		When Click on hotels link
		Then Verify Hotels Landing Page Where Page Title "Hotels: Find Cheap Hotel Rooms & Discount Hotels | Priceline".