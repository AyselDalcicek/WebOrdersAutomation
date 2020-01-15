Feature: Login
  As a user, I want to be able to login

  Scenario: Login as tester
    Given I am on the login page
    Then I login as tester
    And verify that "Web Orders" logo is displayed