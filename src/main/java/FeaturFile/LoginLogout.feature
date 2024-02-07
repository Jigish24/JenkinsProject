Feature: Login and Logout

  Scenario: Login and Logout
    Given Users launch the browser
    When Users navigate to the URL 'http://automationexercise.com'
    Then U verify that the home page is visible successfully

    When I click on 'Signup / Login' button
    Then User verify 'Login to your account' is visible

    When U enter correct email address and password
    And I click 'login' button
    Then U verify that 'Logged in as username' is visible

    When I click 'Logout' button
    Then I verify that user is navigated to login page
