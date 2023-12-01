# BDD
  Scenario: Successful login to GitHub
    Given the user is on the GitHub login page
    When the user enters valid GitHub username and password
    And clicks on the login button
    Then the user is navigated to the GitHub homepage
