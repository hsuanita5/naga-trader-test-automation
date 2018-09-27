package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FavouritesPage extends BasePage {
	public @FindBy(className = "market-watch") WebElement FavouritesScreen;
	public @FindBy(linkText = "Favourites") WebElement favouritesTabButton;
	public @FindBy(xpath = "//*[contains(@title, 'EUR/USD')]//following::button[text() = 'SELL'][1]") WebElement sellButton;



	public FavouritesPage() throws IOException {
		super();
	}
	
	public FavouritesPage LoadFavouritesScreen () throws Exception {
		favouritesTabButton.click();
		wait.until(ExpectedConditions.visibilityOf(FavouritesScreen));
		Thread.sleep(3000);
		//Assert.assertEquals(true, FavouritesScreen.isDisplayed());
		return new FavouritesPage();
	}
	public FavouritesPage clickOnSellButton () throws Exception {
		sellButton.click();
		return new FavouritesPage();
	}

}
