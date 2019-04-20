package com.ui.demo;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ui.demo.pages.HomePage;

public class CheckImageTest extends BaseTest {

	private HomePage homePage;

	@BeforeClass
	public void setup() {
		homePage = new HomePage(driver);
	}

	@Test
	public void findImage() throws Exception {

		WebElement imageFile = homePage.findImage();
		boolean imagePresent = homePage.isImagePresent(imageFile, driver);

		Assert.assertEquals(imagePresent, true);

	}

}
