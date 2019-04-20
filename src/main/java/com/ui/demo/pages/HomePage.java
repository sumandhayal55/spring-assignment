package com.ui.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@class='glyphicon  glyphicon-home']")
	private WebElement root;

	@FindBy(xpath = "//a[contains(.,'Veterinarians')]]")
	private WebElement verterinarians;

	@FindBy(xpath = "//img[@src='/resources/images/pets.png']")
	private WebElement petImage;
	
	@FindBy(xpath = "//a[contains(.,'Find owners')]")
	private WebElement findOwners;
	



	private static final String script = "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0";

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//root.click();
	}

	public void home() {
		root.click();
	}
	
	public WebElement findImage() {
		return petImage;
	}

	public boolean isImagePresent(WebElement imageFile, WebDriver driver) {
		return (Boolean) ((JavascriptExecutor) driver).executeScript(script, imageFile);
	}
	
	public void clickFindOwners() {
		this.findOwners.click();
	}
}
