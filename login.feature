#Author
#Date
@SmokeFeature
Feature: feature to test login
@smoketest
  Scenario Outline: check login is successfull with valid data
    Given user is on login page
    When user enters username and password from given "<login>" and <rownumber>
    And clicks on login button
    Then user is navigated to home page
    
 Examples:
 |Username|0|
 |Username|1|
 
