package com.kiboCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiboCRM.genericLibs.BaseTest;

public class CreateLeadPage {
	
	@FindBy(xpath="//input[@name=\"property(Company)\"]") private WebElement companyTb;
	@FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lastNameTb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement saveTb;
	
public CreateLeadPage() {
	PageFactory.initElements(BaseTest.driver, this);
}

public void createLeadWithMandatoryDetails(String companyName, String ln) {
	companyTb.sendKeys(companyName);
	lastNameTb.sendKeys(ln);
    saveTb.click();
}
}
