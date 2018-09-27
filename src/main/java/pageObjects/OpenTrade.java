package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenTrade extends BasePage {
	public @FindBy(className = "open-trade") WebElement openTradeScreen;
	public @FindBy(css = ".investment-section .enter-value input") WebElement investment;
	public @FindBy(className = "buy-sell-button") WebElement sellAtButton;
	public @FindBy(css =".blue-toggle.pending-toggle label:first-child") WebElement focusOutElement;

	
	public OpenTrade() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public OpenTrade loadOpenTradeScreen () throws Exception {
		wait.until(ExpectedConditions.visibilityOf(openTradeScreen));
		return new OpenTrade();
	}

	public void changeInvestment (String value) throws Exception {
		sendKeysToWebElement(investment, value);
		new OpenTrade();
	}
	public OpenTrade clickOnSellAtButton () throws Exception {
		wait.until(ExpectedConditions.visibilityOf(sellAtButton));
		focusOutElement.click();
		Thread.sleep(1000);
		sellAtButton.click();
		return new OpenTrade();
	}
}
