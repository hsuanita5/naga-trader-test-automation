package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdown extends BasePage{
	public @FindBy(className = "profile-box-container") WebElement avatar;


	public Dropdown() throws IOException {
		super();
	}
	public Dropdown clickOnAvatar () throws Exception {
	
		return new Dropdown();
	}

}
