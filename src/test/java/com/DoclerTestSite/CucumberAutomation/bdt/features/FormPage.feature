Feature: FormPage
  In order to test form page
  As a user
  I want to specify the form page

  Scenario Outline: DTS_FP_01-Check the input box function
    Given user is on landing page
    And Form button is available
    When user clicks on Form button
    Then form page loads
    And form section loads
    When user enters "<Value>" on the box
    And user clicks the GO button
    Then system gives back the "<Result>"
    And the company logo on form page is appears
    And Site Logo is appears
    Examples:
      | Value       | Result         |
      | John        | Hello John!    |
      | Sophia      | Hello Sophia!  |
      | Charlie     | Hello Charlie! |
      | Emily       | Hello Emily!   |

