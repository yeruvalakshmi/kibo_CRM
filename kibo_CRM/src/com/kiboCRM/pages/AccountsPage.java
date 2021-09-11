package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class AccountsPage {
	
	@FindBy (xpath="//input[@name='property(Account Name)']") private WebElement accountNameTb;
	@FindBy (xpath="(//input[@value='Save'])[2]") private WebElement saveBtn; 
	
	public AccountsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void createAccountwithMandatory(String accountsName) {
		accountNameTb.sendKeys(accountsName);	
		saveBtn.click();
	}
	

}
