Feature: FreeCRM login feature

@SmokeTest
Scenario: FreeCRM Login test Scenario

Given User is already on login page
When user enter login details
Then user in the home page

#@SmokeTest1
Scenario: FreeCRM logout test Scenario

Given User is already on login page
When user in login details
Then user move to the home page