package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class HomePage {

	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Setup']") private WebElement setup;
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickLeadsTab() {
		leadsTab.click();
	}
	public void setupTab() {
		setup.click();
	}
}
