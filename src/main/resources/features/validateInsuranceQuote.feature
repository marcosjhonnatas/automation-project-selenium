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
		And I fill in the valid data of quote
		And click in send button
    Then the system should display the message stating that the email was sent successfully
   
