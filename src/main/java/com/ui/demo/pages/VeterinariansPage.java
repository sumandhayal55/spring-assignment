package com.ui.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VeterinariansPage {

	@FindBy(xpath = "//span[@class='glyphicon  glyphicon-th-list']")
	private WebElement root;

	@FindBy(xpath="/html/body/div[@class='container-fluid']")
	private WebElement table;
	
	public VeterinariansPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		root.click();
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
}
