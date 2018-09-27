package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Feed extends BasePage {
	public @FindBy(className = "news-feed") WebElement newsFeed;
	public @FindBy(className = "picture") WebElement avatar;
	public @FindBy(css = ".dropdown-menu .logout") WebElement logoutButton;



	public Feed() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feed feedLoaded() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(newsFeed));			
		return new Feed();
	}
	public Feed clickOnAvatar() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(avatar));
		avatar.click();
		return new Feed();
	}
	public Feed logout() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(logoutButton));
		logoutButton.click();
		return new Feed();
	}
}
