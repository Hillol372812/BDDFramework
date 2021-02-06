$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/BDDWorkspace/BDDFramework/src/main/java/Features/Spicejet.feature");
formatter.feature({
  "line": 1,
  "name": "spicejet end to end testing",
  "description": "",
  "id": "spicejet-end-to-end-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login HomePage",
  "description": "",
  "id": "spicejet-end-to-end-testing;login-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "title of the page should match",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter data in Departure City",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter data in Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User navigate to Search Result Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter traveller details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Select Options in AddsOn Page",
  "keyword": "And "
});
formatter.match({
  "location": "Spicejet.user_open_the_browser()"
});
formatter.result({
  "duration": 109386177256,
  "status": "passed"
});
formatter.match({
  "location": "Spicejet.user_navigate_to_homepage()"
});
formatter.result({
  "duration": 17980953,
  "error_message": "java.lang.NullPointerException\r\n\tat Stepdefination.Spicejet.user_navigate_to_homepage(Spicejet.java:33)\r\n\tat ✽.When User navigate to homepage(C:/BDDWorkspace/BDDFramework/src/main/java/Features/Spicejet.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Spicejet.title_of_the_page_should_match()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Spicejet.enter_data_in_Departure_City()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Spicejet.enter_data_in_Arrival_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Spicejet.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Spicejet.user_navigate_to_Search_Result_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Spicejet.enter_traveller_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Spicejet.select_Options_in_AddsOn_Page()"
});
formatter.result({
  "status": "skipped"
});
});