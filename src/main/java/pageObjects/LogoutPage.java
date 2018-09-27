package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage extends BasePage {
	public @FindBy(className = "logout-form") WebElement logoutForm;
	public @FindBy(css = ".logout-form__back-to-login") WebElement backToLoginButton;

	public LogoutPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public LogoutPage logoutFormShown() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(logoutForm));
		return new LogoutPage();
	}

	public LogoutPage backToLoginForm() throws Exception {
		backToLoginButton.click();
		wait.until(ExpectedConditions.visibilityOf(loginPage.signInForm));
		return new LogoutPage();
	}
	
}
