package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
	public @FindBy(css = ".login-form .default-input:first-child input") WebElement usernameOrEmail;
	public @FindBy(css = ".login-form .default-input:nth-child(2) input") WebElement password;
	public @FindBy(className = "login-form__sign-in") WebElement signInButton;
	public @FindBy(className = "login-form") WebElement signInForm;
	public @FindBy(css = ".login-form__create-account button") WebElement createAccount;
	public @FindBy(className = ".login-form__try-app__button") WebElement tryGuestMode;
	public @FindBy(xpath = "//button//img[starts-with(@alt,'Login with Facebook' )]") WebElement facebookButton;
	public @FindBy(xpath = "//button//img[starts-with(@alt,'Login with Google' )]") WebElement googleButton;
	public @FindBy(xpath = "//button[text() = 'Forgot?']") WebElement forgotPasswordButton;
	public @FindBy(className = "alert-danger") WebElement invalidLoginMessage;

	
	public LoginPage() throws IOException {
		super();
	}
		
	public void enterUsername (String username) throws Exception {
		sendKeysToWebElement(usernameOrEmail, username);
		 new LoginPage();
	}

		public void enterPassword (String pass) throws Exception {
			sendKeysToWebElement(password, pass);
			new LoginPage();
		}
		public LoginPage signIn () throws Exception {
			signInButton.click();
			return new LoginPage();
		}
		public LoginPage validateLogin () throws Exception {
			wait.until(ExpectedConditions.visibilityOf(invalidLoginMessage));			
			Assert.assertEquals(true, invalidLoginMessage.isDisplayed());
			String message = invalidLoginMessage.getText();
			Assert.assertEquals("Invalid Username/Password", message);
			return new LoginPage();
		}
	}
