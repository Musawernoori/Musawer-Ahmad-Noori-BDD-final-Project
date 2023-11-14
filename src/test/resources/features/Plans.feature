Feature: Validate Plans elements


  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Then click on Plans



  @US_8
  Scenario: validate 4 row of data is present in plans page
    Then validate plans section title as "Today's Plans Price"
    Then validate plan table headers
      | PLAN TYPE | PLANE BASE PRICE | DATE CREATED | DATE EXPIRE |
    Then validate 1 row of data is present


