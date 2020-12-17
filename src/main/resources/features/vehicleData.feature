
@tag
Feature: Insert vehicle data

  	As a user I can enter vehicle data

  @tag1
  Scenario: Insert vehicle data
		Given that I am on the vehicle form
		When I fill in the valid data
		And click next
		Then the system should redirect to the Enter Insurant Data tab

