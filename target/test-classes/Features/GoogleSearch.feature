Feature: Feature to test search

Scenario: Validate search is working

Given browser is open
And user is on google search page
When user enters a text
And hits enter
Then user gets the result