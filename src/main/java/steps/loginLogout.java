package steps;
import utils.DriversFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;

public class loginLogout extends DriversFactory {
	
	@Given("^User enters username$")
	public void user_enters_username() throws Throwable {
	   loginPage.enterUsername(BasePage.readPropertiesFileValue("username"));
	}

	@And("^User enters password$")
	public void user_enters_password() throws Throwable {
		loginPage.enterPassword(BasePage.readPropertiesFileValue("password"));

	}

	@When("^User clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
		loginPage.signIn();
	}

	@Then("^User should be presented with Favourites screen$")
	public void user_should_be_presented_with_Favourites_screen() throws Throwable {
		feedPage.feedLoaded();

	}
	@When("^User clicks on avatar$")
	public void user_clicks_on_avatar() throws Throwable {
	   feedPage.clickOnAvatar();
	}

	@When("^User clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
	 feedPage.logout();
	}

	@Then("^User should be landed on logout form$")
	public void user_should_be_landed_on_logout_form() throws Throwable {
	 logoutPage.logoutFormShown();
	}
}
