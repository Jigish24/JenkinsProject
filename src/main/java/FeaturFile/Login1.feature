Feature: Login Feature

  Scenario Outline: Navigate log in
    Given I am on login page
    When I Enter "<UserName>" and "<Passwords>"
    And I click on Login button
    Then I Should see outcome

    Examples:
      | UserName           | Passwords |
      | jigish24@gmail.com | 1234567   |
      | jig ish24@gmail.com| 123789    |
      | jig ish24@gmail.com| ABC1234   |
      | jig ish24@gmail.com|           |
