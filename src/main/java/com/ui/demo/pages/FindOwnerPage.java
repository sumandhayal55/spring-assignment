package com.ui.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindOwnerPage {

	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement findOwner;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement addOwner;
	
	@FindBy(xpath="/html/body/div[@class='container-fluid']")
	private WebElement table;
	
	@FindBy(xpath="//a[contains(.,'Find owners')]")
	private WebElement root;
	
	public FindOwnerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		root.click();
	}
	
	public void clickFindOwnerButton() {
		findOwner.click();
	}
	
	public List<WebElement> getTableHeaders() {
		return table.findElements(By.tagName("th"));
	}
	
	public List<WebElement> getTableRows() {
		return table.findElements(By.tagName("tr"));
	}
	
	public List<WebElement> getTableColumns(WebElement tableRow) {
		return tableRow.findElements(By.tagName("td"));
	}
	
	public void clickAddOwner() {
		addOwner.click();
	}
	
	

}
