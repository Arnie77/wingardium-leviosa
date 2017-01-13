Feature: NavigationBar
  In order to test navigation bar
  As a user
  I want to specify the navigation bar

  Scenario Outline: DTS_NB_01-Clicks through all menu item and s Site Logo appearence
    Given user is on landing page
    When <Button> is available
    And user clicks on <Button>
    Then <Page> loads
    And Site Logo is appears
  Examples:
    | Button      | Page |
    | Home button | home page |
    | Form button | form page |
    | Site logo   | home page |

  Scenario Outline: DTS_NB_02-Clicks through all menu item and checks Company Logo appearence
    Given user is on landing page
    When <Button> is available
    And user clicks on <Button>
    Then <Page> loads
    And the company logo on <Page> is appears
    Examples:
      | Button      | Page |
      | Home button | home page |
      | Form button | form page |
      | Site logo   | home page |

  Scenario Outline: DTS_NB_03-Clicks through all menu item and checks is menu item become active
    Given user is on landing page
    When <Button> is available
    And user clicks on <Button>
    Then <Page> loads
    And  <Button> turns active state
    Examples:
      | Button      | Page      |
      | Home button | home page |
      | Form button | form page |
      | Site logo   | home page |

  Scenario: DTS_NB_04-Check Error button function
    Given user is on landing page
    When user clicks on Error button
    Then system gives HTTP 404 response

