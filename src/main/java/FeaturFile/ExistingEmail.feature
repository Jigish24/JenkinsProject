Feature: Signup with Existing Email Address

  Scenario: Signup with Existing Email Address
    Given Us launch the browser
    When Us navigate to the URL 'http://automationexercise.com'
    Then Us verify that the home page is visible successfully

    When Us click on 'Signup / Login' button
    Then Us verify 'New User Signup!' is visible

    When I enter name and already registered email address
    And Us click 'Signup' button
    Then Us verify error 'Email Address already exists!' is visible
