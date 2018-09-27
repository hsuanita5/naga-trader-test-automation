@loginDependency
Feature: Open a trade (with/without limits)
Background: User goes to Open trade screen
	Given User navigates to Favourites screen
	When User clicks on Sell button next to trade(EUR/USD)
	Then Open Trade screen is displayed with a chart

Scenario: User opens a Sell trade without limits (Naga Protector Off)
Given User modifies investment value
When User clicks on Sell at button
Then Pop-up modal representing successfully opened trade is displayed
When User clicks on 'OK,thanks' button
Then Pop-up modal is closed
When User clicks on 'My trades' tab
Then User should see on the top previously opened trade
