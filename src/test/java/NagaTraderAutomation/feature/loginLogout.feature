@smoke
Feature: Log in with valid credentials 

Scenario: User should be logged in to Naga Trader using valid credentials 
	Given User enters username
	And User enters password 
	When User clicks on Sign in button 
	Then User should be presented with Favourites screen
	When User clicks on avatar
	And User clicks on logout button
	Then User should be landed on logout form
	