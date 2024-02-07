Feature: Login and Account Deletion

  Scenario: Login and Delete Account
    Given I launch the browser
    When I navigate to the URL 'http://automationexercise.com'
    Then I verify that the home page is visible successfully
    When I click on Signup  Login button
    Then I verify 'Login to your account' is visible
    When I enter correct email address and password
    And User click LogIn button
    Then User verify that Logged in as username is visible
    And  User delete account button
    And I verify that 'ACCOUNT DELETED!' is visible

