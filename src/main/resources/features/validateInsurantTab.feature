Feature: Insert insurant data
  Scenario: Insert valids data in the insurant form
    Given that I am on the insurant form
    When I fill in the valid data of insurance
    And click next	
    Then the system should redirect to the Enter Product Data tab