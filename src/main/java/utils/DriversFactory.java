package utils;
 
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Dropdown;
import pageObjects.FavouritesPage;
import pageObjects.LoginPage;
import pageObjects.Feed;
import pageObjects.LogoutPage;
import pageObjects.OpenTrade;
 
public class DriversFactory  {
	public static WebDriver driver;
	public static LoginPage loginPage;
	public static FavouritesPage favouritesPage;
	public static Dropdown dropdownPage;
	public static Feed feedPage;
	public static LogoutPage logoutPage;
	public static OpenTrade openTradePage;


	
	public WebDriver getDriver() {
		
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
			p.load(fi);
			String browserName = p.getProperty("browser");
			
 
			switch (browserName) {
 
			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					FirefoxOptions options = new FirefoxOptions();
					driver = new FirefoxDriver(options);
				}
				break;
 
		
		   //chrome setup
			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					//CHROME OPTIONS
					ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver(options);
					driver.manage().window().maximize();
				}
				break;
			}	
		} catch (Exception e) {
			System.out.println("Unable to load browser! - Exception: " + e.getMessage());
		} finally {
 			loginPage = PageFactory.initElements(driver,LoginPage.class);
 			favouritesPage = PageFactory.initElements(driver,FavouritesPage.class);
 			dropdownPage= PageFactory.initElements(driver, Dropdown.class);
 			feedPage= PageFactory.initElements(driver, Feed.class);
 			logoutPage = PageFactory.initElements(driver, LogoutPage.class);
 			openTradePage= PageFactory.initElements(driver, OpenTrade.class);
 
		}
		return driver;
	}

}
