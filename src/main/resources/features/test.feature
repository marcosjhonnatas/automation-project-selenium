Feature: Insert vehicle data
  Scenario: Insert valids data in the vehicle form
    Given that I am on the vehicle form
    When I fill in the valid data
    And click next	
    Then the system should redirect to the Enter Insurant Data tab