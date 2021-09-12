package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class HomePage {

	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Setup']") private WebElement setup;
	@FindBy(xpath="//a[@id='Accountstab']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactsTab;
	@FindBy(xpath="//a[text()='Potentials']") private WebElement potentialsTab;
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignsTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickleadsTab() {
		leadsTab.click();
	}
		public void clicksetupTab() {
			setup.click();
		}
		public void clickaccountsTab() {
		accountsTab.click();
		}
		public void clickcontactsTab() {
		contactsTab.click();
		}
		public void clickpotentialsTab() {
			potentialsTab.click();
		}
		public void clickcampaignsTab() {
		campaignsTab.click();
	}
}
