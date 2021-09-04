package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class CreateAccount {
	
	@FindBy(xpath="//a[@id='Accountstab']") private WebElement accountslink;
	@FindBy(xpath="//input[@value='New Account']") private WebElement newaccountlink;
	@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accountnameTB;
	@FindBy(xpath="//input[@value='Save']") private WebElement saveBtn;
	
	public CreateAccount() {
		PageFactory.initElements(BaseTest.driver, this);	
	}
	
	


}
