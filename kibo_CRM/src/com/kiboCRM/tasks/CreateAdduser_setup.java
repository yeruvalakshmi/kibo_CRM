package com.kiboCRM.tasks;

import com.kiboCRM.genericLibs.BaseTest;
import com.kiboCRM.genericLibs.FileLib;
import com.kiboCRM.genericLibs.WebDriverCommonLib;
import com.kiboCRM.pages.AddUser;
import com.kiboCRM.pages.CreateLeadPage;
import com.kiboCRM.pages.CustomViewPage;
import com.kiboCRM.pages.HomePage;
import com.kiboCRM.pages.LoginPage;
import com.kiboCRM.pages.SetUp;

public class CreateAdduser_setup extends BaseTest {

	public static void main(String[] args) throws Throwable {
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		Thread.sleep(3000);
		
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"),"homeTitle");
		
		HomePage hp = new HomePage();	
		hp.setupTab();
		 SetUp setup = new SetUp();
		 setup.setupclick();
		
//		AddUser au = new AddUser();
//	au.addUserwithMandatoryfields(flib.readExcelData(EXCEL_PATH, "Setup", 0, 1), 
//				flib.readExcelData(EXCEL_PATH, "Setup", 0, 2), flib.readExcelData(EXCEL_PATH, "Setup", 0, 3),
//				flib.readExcelData(EXCEL_PATH, "Setup", 0, 4));
//	//au.createuserBtn();
//	
    bt.closeBrowser();	
			
		}


	}

