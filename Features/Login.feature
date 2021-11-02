Feature: Test CRM Application
Scenario: Validate Login Functionality

Given User launch CRM browser
When User enter valid username and password
Then user click on login button
Then User is on homepage
Then close browser