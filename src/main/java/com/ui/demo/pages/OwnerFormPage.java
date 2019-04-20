package com.ui.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerFormPage {
	
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement addOwnerButton;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	
	@FindBy(id="address")
	private WebElement address;
	
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="telephone")
	private WebElement telephone;

	
	
	public void clickAddOwnerButton() {
		this.addOwnerButton.click();
	}
	
	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getAddOwnerButton() {
		return addOwnerButton;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getTelephone() {
		return telephone;
	}
	
	
	public OwnerFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
