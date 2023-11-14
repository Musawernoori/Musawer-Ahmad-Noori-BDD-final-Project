Feature: Validate Login elements


  @US_5
  Scenario: Verify login page and successful login
    Then navigate and click login button
    And validate the login page title as "Sign in to your Account"
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    And validate the signed in portal title as "Customer Service Portal"

  @US_6
  Scenario Outline: Validate error message using wrong credentials
    Then navigate and click login button
    And validate the login page title as "Sign in to your Account"
    Then enter username as "<username>" and password as "<password>"
    Then navigate and click sign in button
    And validate the "<errorMessage>" with wrong credentials
    Examples:
      | username    | password        | errorMessage |
      | supervisorr | tek_supervisor  | ERROR        |
      | supervisor  | ttek_supervisor | ERROR        |
