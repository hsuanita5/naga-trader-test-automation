package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.BasePage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriversFactory;

public class MasterHooks extends DriversFactory {
	@Before(order = 0)
	public void setup() throws Exception {
		driver = getDriver();
	}

	@Before(order = 1)
	public void openNagaTrader() throws Exception {
		String url = System.getProperty("url");
		driver.get(url);
	}

	@Before(value = "@loginDependency", order = 2)
	public void loginToTrader() throws Exception {
		loginPage.enterUsername(BasePage.readPropertiesFileValue("username"));
		loginPage.enterPassword(BasePage.readPropertiesFileValue("password"));
		loginPage.signIn();
		feedPage.feedLoaded();
	}
	
	@After(value = "@loginDependency", order=1)
	public void logoutFromTrader() throws Exception {
		feedPage.clickOnAvatar();
		feedPage.logout();
		logoutPage.logoutFormShown();
	}
	@After(order = 0)
	public void tearDownAndTakeScreenshotOnFailure(Scenario scenario) {
		if (driver != null && scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "img/png");
		}
		try {
			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Method Failed: tearDownAndTakeScreenshotOnFailure, Exception: " + e.getMessage());
		}
	}

	

}
