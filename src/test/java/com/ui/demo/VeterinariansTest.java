package com.ui.demo;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ui.demo.model.Veterniarians;
import com.ui.demo.pages.VeterinariansPage;
import com.ui.demo.transformer.WebElementTransformer;

public class VeterinariansTest extends BaseTest {

	private VeterinariansPage veterinariansPage;

	@BeforeClass
	public void setup() {
		veterinariansPage = new VeterinariansPage(driver);
	}

	@Test
	public void veterinarians_Data() {
		List<Veterniarians> veterinarians = WebElementTransformer.toVeterniarians(veterinariansPage, driver);
		System.out.println(veterinarians);
	}

}
