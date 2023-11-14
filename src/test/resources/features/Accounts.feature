Feature: Verifying the Accounts page in the UI tek insurance webpage

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Given Click on the Accounts button

   @US_13
  Scenario:Verifying the number of accounts existed in Accounts page to be 5

      Then Verify there is 5 rows in the table
      Then validate validate the show per to be "Show 5"


      Scenario Outline:Change show per page to 10, 25, 50 and validate table records per page according to selected show per page.
        When selected "<selectedNumber>"
        Then <rowPageNumber> per page should be visible
        Examples:
          | selectedNumber | rowPageNumber |
          | Show 5         | 50            |
          | Show 10        | 10            |
          | Show 25        | 25            |
          | Show 50        | 50            |


