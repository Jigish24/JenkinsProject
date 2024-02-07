
Feature: Login with Incorrect Credentials

  Scenario: Login with Incorrect Credentials
    Given User launch the browser
    When User navigate to the URL 'http://automationexercise.com'
    Then  User verify that the home page is visible successfully

    When User click on 'Signup / Login' button
    Then  Use verify 'Login to your account' is visible

    When I enter incorrect email address and password
    And Use click 'login' button
    Then I verify error 'Your email or password is incorrect!' is visible
