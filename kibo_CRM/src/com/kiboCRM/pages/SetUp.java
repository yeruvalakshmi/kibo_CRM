package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class SetUp {
	
	@FindBy(xpath="//a[text()='Admin Settings']") private WebElement adminsettings;
	@FindBy(xpath="//a[text()='Add User']") private WebElement adduser;
	
	public SetUp() {
		
PageFactory.initElements(BaseTest.driver, this);	
	}
	
		public void setupclick() {

		    adminsettings.click();
			adduser.click();

	}

}
