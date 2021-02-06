Feature: Makemytrip search feature

@SmokeTest1
Scenario: Launch the browser and navigate to Makemytrip homepage

Given Launch the browser
When User navigate to launch the URL
Then user in the maemytrip home page

@SmokeTest
Scenario: Select source and destination with pasenger details. 


Given Launch the browser
Given User navigate to launch the URL
Then user in the maemytrip home page
When Enter the Source
And Destination with passenger details
And Click on Departure and select the date
And Click on return date and select the date
And Click on search button 
Then User in the search result page.
