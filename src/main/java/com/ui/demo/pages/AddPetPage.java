package com.ui.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPetPage {
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement addPetButton;
	

	@FindBy(id="name")
	private WebElement name;
	
	
	@FindBy(id="birthDate")
	private WebElement birthDate;
	
	
	@FindBy(id="type")
	private WebElement type;
	
	
	@FindBy(linkText="Add New Pet")
	private WebElement root;
	

	public AddPetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		root.click();
	}
	
	
	public WebElement getAddPetButton() {
		return addPetButton;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getBirthDate() {
		return birthDate;
	}

	public WebElement getType() {
		return type;
	}

	
	
}
