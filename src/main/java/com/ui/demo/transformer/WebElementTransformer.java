package com.ui.demo.transformer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ui.demo.model.Owner;
import com.ui.demo.model.Veterniarians;
import com.ui.demo.pages.FindOwnerPage;
import com.ui.demo.pages.VeterinariansPage;

public class WebElementTransformer {

	public static List<Owner> toOwners(FindOwnerPage page) {
		List<Owner> owners = new ArrayList<Owner>();
		List<WebElement> rows = page.getTableRows();
		for(int i = 1 ; i < rows.size() ; i ++) {
			List<WebElement> columns = page.getTableColumns(rows.get(i));
			Owner owner = new Owner()
							.withName(columns.get(0).getText())
							.withAddress(columns.get(1).getText())
							.withCity(columns.get(2).getText())
							.withTelephone(columns.get(3).getText())
							.withPets(columns.get(4).getText());
			owners.add(owner);
		}
		return owners;
	}

	public static List<Veterniarians> toVeterniarians(VeterinariansPage page, WebDriver driver) {
		List<Veterniarians> veterniarians = new ArrayList<Veterniarians>();
		List<WebElement> rows = page.getTableRows();
		for(int i = 1 ; i < rows.size() ; i ++) {
			List<WebElement> columns = page.getTableColumns(rows.get(i));
			Veterniarians veterniarian = new Veterniarians()
											.withName(columns.get(0).getText())
											.withSpecialities(columns.get(1).getText());
			veterniarians.add(veterniarian);
		}
		return veterniarians;
	}
}
