package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class CustomViewPage {
	@FindBy(xpath="//input[@value=\"New Lead\"]") private WebElement newLeadsBtn;
	@FindBy (xpath="//input[@value='New Account']") private WebElement newAccountLink;
	
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickNewLeadBtn()
	{
		newLeadsBtn.click();
	}
	public void clickNewAccountLink() {
		newAccountLink.click();
	}

}
