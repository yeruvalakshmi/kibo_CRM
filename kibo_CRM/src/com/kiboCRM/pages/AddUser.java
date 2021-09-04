package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class AddUser {

	@FindBy(xpath="//input[@name='j_organization']") private WebElement CompanyName;
	@FindBy(xpath="//input[@name='lastName']") private WebElement LastName;
	@FindBy(xpath="//input[@name='j_username']") private WebElement CRMEmailId;
	@FindBy(xpath="//input[@name='secretAnswer']")private WebElement answerTB;
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createuserBtn;
	
	
	public AddUser() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void addUserwithMandatoryfields(String companyName, String lastName, String emailId,String answer ) {
		
		CompanyName.sendKeys(companyName);
		LastName.sendKeys(lastName);
		CRMEmailId.sendKeys(emailId);
		answerTB.sendKeys(answer);
				
	}
	
	public void createuserBtn() {
			createuserBtn.click();	
	}
}
