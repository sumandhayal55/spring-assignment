package com.ui.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidatePage {
	
	
	
	@FindBy(css ="table[class='table table-striped']")
	private List<WebElement> tables;
	
	@FindBy(css="dl[class='dl-horizontal']")
	private WebElement table2;
	
	public ValidatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTable2() {
		return table2;
	}
	
	public List<WebElement> getTableRowsFromTable1() {
		return tables.get(0).findElements(By.tagName("tr"));
	}
	
	public List<WebElement> getTableColumns(WebElement tableRow) {
		return tableRow.findElements(By.tagName("td"));
	}


	public List<WebElement> getTable2Rows() {
		return table2.findElements(By.tagName("dt"));
	}
	
	public List<WebElement> getTable2Columns() {
		return table2.findElements(By.tagName("dd"));
	}
}
