@Regrassion
   Feature: Flight functionality
   
   @Flights
   Scenario: verify if user is able to book a flight with valid details
   When Click on header link Flights from Home screen
   And Click on Radio button One-Way
   And Enter "LGA" as Destination
   And Enter "DTW" as Arrival city
   