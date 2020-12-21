Feature: Select price options
  Scenario: Select price platinum
   	Given that I am on the vehicle form
    When I fill in the valid data of vehicle
  	And click next
    And I fill in the valid data of insurance
  	And click next
    And I fill in the valid data of product
  	And click next
		And I select the price
		And click next
    Then the system should redirect to the Send Quote tab