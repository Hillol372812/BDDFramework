Feature: spicejet end to end testing

@Test
Scenario: Login HomePage 

Given user open the browser
When User navigate to homepage
Then title of the page should match
When Enter data in Departure City 
And Enter data in Arrival city
And Click on search button
Then User navigate to Search Result Page
And Enter traveller details
And Select Options in AddsOn Page