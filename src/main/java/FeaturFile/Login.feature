
Feature: Login


  Scenario:Positive log in Functionality

    Given I am on logg in page
    When I enter valid username
    And I Enter Valid Password
    And I click on Login button
    Then I should Login
    And I should see Log in massage Welcome


