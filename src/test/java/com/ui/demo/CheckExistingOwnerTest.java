package com.ui.demo;

import java.util.List;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ui.demo.model.Owner;
import com.ui.demo.pages.FindOwnerPage;
import com.ui.demo.transformer.WebElementTransformer;


public class CheckExistingOwnerTest extends BaseTest {
	
	private FindOwnerPage findOwnerPage;

	@BeforeClass
	public void setup() {
		findOwnerPage = new FindOwnerPage(driver);
		
	}

	@Test
	public void existingOwner_Data() {
		findOwnerPage.clickFindOwnerButton();
		List<Owner> owners = WebElementTransformer.toOwners(findOwnerPage);
		System.out.println(owners);
	}

}
