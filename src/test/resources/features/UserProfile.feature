Feature: Validate user profile elements


  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Then click on profile icon

  @US_6
  Scenario: validate profile information on side drawer
    And validate Status as "Active", UserType as "CSR", Name as "Supervisor", Username as "supervisor" and Authorities as "admin"
    And logout button should be "enabled"



  @US_7
  Scenario: validate sign in and logout functionality
    Then click on logout Button
    And validate home Page Text as "Lets get you started"

