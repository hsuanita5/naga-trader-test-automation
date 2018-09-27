package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import utils.DriversFactory;


public class openSellTrade extends DriversFactory {
	@Given("^User navigates to Favourites screen$")
	public void user_navigates_to_Favourites_screen() throws Throwable {
		favouritesPage.LoadFavouritesScreen();
	}
	@When("^User clicks on Sell button next to trade\\(EUR/USD\\)$")
	public void user_clicks_on_Sell_button_next_to_trade_EUR_USD() throws Throwable {
		favouritesPage.clickOnSellButton();
	
	}

	@Then("^Open Trade screen is displayed with a chart$")
	public void open_Trade_screen_is_displayed_with_a_chart() throws Throwable {
		openTradePage.loadOpenTradeScreen();
	}

	@Given("^User modifies investment value$")
	public void user_modifies_investment_value() throws Throwable {
		openTradePage.changeInvestment(BasePage.readPropertiesFileValue("investmentValue"));
	}

	@When("^User clicks on Sell at button$")
	public void user_clicks_on_Sell_at_button() throws Throwable {
	}
	@Then("^Pop-up modal representing successfully opened trade is displayed$")
	public void pop_up_modal_representing_successfully_opened_trade_is_displayed() throws Throwable {
	   
	}

	@When("^User clicks on 'OK,thanks' button$")
	public void user_clicks_on_OK_thanks_button() throws Throwable {
	    
	}

	@Then("^Pop-up modal is closed$")
	public void pop_up_modal_is_closed() throws Throwable {
	    
	}

	@When("^User clicks on 'My trades' tab$")
	public void user_clicks_on_My_trades_tab() throws Throwable {
	   
	}

	@Then("^User should see on the top previously opened trade$")
	public void user_should_see_on_the_top_previously_opened_trade() throws Throwable {
	
	}
}
