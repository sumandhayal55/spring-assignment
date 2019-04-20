package com.ui.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.ui.demo.constant.Constant;
import com.ui.demo.pages.HomePage;

public class BaseTest {

	protected static WebDriver driver;
	private static final String chromeDriverPath = Constant.CHROME_DRIVER_LOC;
	private static final String url = Constant.URL;
	private static final String chromeDriverProperty = "webdriver.chrome.driver";
	private static HomePage homePage;

	/**
	 * 
	 * Runs only once, when the testNG suite is started.
	 */
	@BeforeSuite
	public void startBrowser() {
	
		System.setProperty(chromeDriverProperty, chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(url);
		homePage = new HomePage(driver);
		
	}

	/**
	 * 
	 * Runs at the beginning of every Test class execution.
	 * Home page will be the default page before the start of every Test class execution.  
	 */
	@BeforeClass
	public void startOver() {
		homePage.home();
	}
	
	/**
	 * 
	 * closes the browser after all the Test classes finished execution.
	 */
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}
}
