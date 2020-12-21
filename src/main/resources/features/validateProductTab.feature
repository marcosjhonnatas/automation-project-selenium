Feature: Insert product data
  Scenario: Insert valids data in the product form
    Given that I am on the product form
    When I fill in the valid data of product
    And click next	
    Then The system should display the data mandatory message 
    