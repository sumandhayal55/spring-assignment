package com.ui.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ui.demo.constant.Constant;
import com.ui.demo.model.Owner;
import com.ui.demo.model.Pet;
import com.ui.demo.pages.AddPetPage;
import com.ui.demo.pages.ExcelUtils;
import com.ui.demo.pages.FindOwnerPage;
import com.ui.demo.pages.HomePage;
import com.ui.demo.pages.OwnerFormPage;
import com.ui.demo.pages.ValidatePage;


public class CreateNewOwnerTest extends BaseTest {
	
	
	private FindOwnerPage findOwnerPage;
	private OwnerFormPage ownerFormPage;

	@BeforeClass
	public void setup() {
		
		findOwnerPage = new FindOwnerPage(driver);
		findOwnerPage.clickAddOwner();
		ownerFormPage = new OwnerFormPage(driver);
		
	}
	
	 	
	@Test
	public void clickToCreateOwner() throws Exception {
		
		
		ExcelUtils.setExcelFile(Constant.FILE_PATH,"OwnerDetails");
       
		  Owner owner;
		   
		
		 String firtName = ExcelUtils.getCellData(1, 1);
		 String lastName = ExcelUtils.getCellData(1, 2);
		 String address = ExcelUtils.getCellData(1, 3);
		 String city = ExcelUtils.getCellData(1, 4);
		 String  telephone = ExcelUtils.getCellData(1, 5);
		 owner = new Owner(firtName, lastName, telephone, address, city);
		 setOwner(owner);
		
		
		
	}
	
	public void setOwner(Owner owner) throws Exception {
		ownerFormPage.getFirstName().sendKeys(owner.getFirstName());
		ownerFormPage.getLastName().sendKeys(owner.getLastName());
		ownerFormPage.getAddress().sendKeys(owner.getAddress());
		ownerFormPage.getCity().sendKeys(owner.getCity());
		ownerFormPage.getTelephone().sendKeys(owner.getTelephone());
		ownerFormPage.clickAddOwnerButton();	
		
		
		Pet pet = addPet();
		validateData(owner, pet);
		
		System.out.println("tested");
		
  
	}
		   
	

	
	private Pet getPetDetails() throws Exception {
		ExcelUtils.setExcelFile(Constant.FILE_PATH, "AddPetDetails");
		String pet_Name = ExcelUtils.getCellData(1, 1);
		 String pet_BirthDate = ExcelUtils.getCellData(1, 2);
		 String type = ExcelUtils.getCellData(1, 3);
		 Pet pet = new Pet(pet_Name, pet_BirthDate,  type);
		 
		 return pet;
	}

	public Pet addPet() {
		try {
			
			
			AddPetPage addPetPage = new AddPetPage(driver);
			
			Pet pet = getPetDetails();
			
	        
			 WebElement element=  addPetPage.getType();
			 Select oSelect=new Select(element);
			
			 addPetPage.getName().sendKeys(pet.getName());;
			 addPetPage.getBirthDate().sendKeys(pet.getDob());
			 oSelect.selectByVisibleText(pet.getType().toLowerCase());
			 addPetPage.getAddPetButton().click();
			 
				return pet;		 
			 
		} catch (Exception e) {
			driver.close();
		}
		return null;
	}

	public void validateData(Owner owner, Pet pet) throws InterruptedException {
		
		
		ValidatePage validatePage = new ValidatePage(driver);   
    	String[] resultDetails = new String[5];
    	
    	List<WebElement> rows = validatePage.getTableRowsFromTable1();
    	int iter = 0;
    	for (WebElement row : rows) {
    	    for (WebElement el : validatePage.getTableColumns(row)) {
    	    	resultDetails[iter++]=   el.getText();
        	}
    	}
    	Assert.assertEquals(owner.getName(), resultDetails[0]);
    	Assert.assertEquals(owner.getAddress().trim(), resultDetails[1]);
    	Assert.assertEquals(owner.getCity(), resultDetails[2]);
    	Assert.assertEquals(owner.getTelephone(), resultDetails[3]);    	
    	
     	
    	List<WebElement> dds = validatePage.getTable2Columns();
    	String[] result=new String[3];
    	iter=0;
    	
    	for (WebElement el : dds) {
    		result[iter++]=el.getText();
    	}
    	
    	Assert.assertEquals(Pet.getName(), result[0]);
    	Assert.assertEquals(Pet.getDob(), result[1]);
    	Assert.assertEquals(Pet.getType(), result[2]);
    	
	
	}

}
