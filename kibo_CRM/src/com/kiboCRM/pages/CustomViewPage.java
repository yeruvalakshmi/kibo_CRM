package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class CustomViewPage {
	@FindBy(xpath="//input[@value=\"New Lead\"]") private WebElement newLeadsBtn;
	@FindBy(xpath="//input[@value='New Account']") private WebElement newAccountLink;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement newContactsLink;
	@FindBy(xpath="//input[@value='New Potential']") WebElement newPotentialLink;
	@FindBy(xpath="//input[@value='New Campaign']") WebElement newCampaignLink;
	
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickNewLeadBtn()
	{
		newLeadsBtn.click();
	}
		public void clickNewAccountsBtn() {
			newAccountLink.click();
		}
		public void clickNewContactsBtn() {
		newContactsLink.click();
		}
		public void clickNewPotentialLink() {
		newPotentialLink.click();
		}
		public void clickNewCampaignLink() {
		newCampaignLink.click();
	}

}
