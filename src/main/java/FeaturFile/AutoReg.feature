
Feature: User Signup

  Scenario: Signup Login and Account Deletion
    Given I launch the browser
    When  I navigate to the URL
    Then  I verify that the home page is visible
    When I click on Signup Login button
    Then I verify New User Signup is visible
    When I enter the following details
      | Field                 | Value                    |
      | Name                  | Jigish Patel             |
      | Email Address         | jigish1232000@yahoo.co.in|

    And  I click Signup button
    Then I verify that ENTER ACCOUNT INFORMATION is visible

    When I fill in the following details
      | Title                 | Mr                                |
      | Name                  | Jigish Patel                      |
      | Email                 | jigish1232000@yahoo.co.in         |
      | Password              | Jigish_24                         |
      | Day                   | 24                                |
      | Month                 | August                            |
      | Year                  | 1980                              |

    And I select checkbox Sign up for our newsletter
    And I select checkbox Receive special offers from our partners

    And I fill in the following additional details
      | First Name            | Jigish                |
      | Last Name             | Patel                 |
      | Company               | JB Financial          |
      | Address               | 4                     |
      | Address2              | Chiltern road         |
      | Country               | India                 |
      | State                 | Northamptonshire      |
      | City                  | Corby                 |
      | Zipcode               | NN188GW               |
      | Mobile Number         | 01234567890           |

    And I click Create Account button
    Then I verify that ACCOUNT CREATED is visible
    And I click Continue button
    Then I verify that Logged in as username is visible
    When I click Delete Account button
    Then I verify that ACCOUNT DELETED is visible




