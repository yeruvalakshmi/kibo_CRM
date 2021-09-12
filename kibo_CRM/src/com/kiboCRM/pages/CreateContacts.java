package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class CreateContacts {
	
	@FindBy (xpath="//input[@name='property(Last Name)'") private WebElement lastName;
	@FindBy (xpath="(//input[@value='Save'])[2]") private WebElement saveTb;
	
	public CreateContacts() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void createLeadWithMandatoryDetails(String lastNameTb) {
		
		lastName.sendKeys(lastNameTb);
	    saveTb.click();
	}

}
