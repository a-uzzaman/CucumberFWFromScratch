Feature: Sign up
  Scenario: Test successful signup
    Given I am at the landing page
    When Navigate to Sign Up page
    And I enter user data
    And Submit to create account
    Then New user should be created and Student ID will be provided
