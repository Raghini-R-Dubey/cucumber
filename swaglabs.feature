@SmokeFeature
Feature: feature to test swag labs functionality.
@smoketest
Scenario: Validate swag labs is working.


   Given browser is open.
   And user is on swag labs page.
    When user enters the credentials in textfields.
    And hits login.
   Then user is navigated to the home page.
