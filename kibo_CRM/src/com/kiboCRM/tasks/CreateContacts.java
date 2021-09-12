package com.kiboCRM.tasks;

import com.kiboCRM.genericLibs.BaseTest;
import com.kiboCRM.genericLibs.FileLib;
import com.kiboCRM.genericLibs.WebDriverCommonLib;
import com.kiboCRM.pages.CreateLeadPage;
import com.kiboCRM.pages.CustomViewPage;
import com.kiboCRM.pages.HomePage;
import com.kiboCRM.pages.LoginPage;

public class CreateContacts extends BaseTest {

public static void main(String[] args) throws Throwable {
				BaseTest bt=new BaseTest();
				bt.openbrowser();
				
				LoginPage lp=new LoginPage();
				FileLib flib=new FileLib();
				lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
				
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"),"homeTitle");
				
				HomePage hp=new HomePage();
				hp.clickcontactsTab();
				
				wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"),"Custom View Page" );
				
			CustomViewPage cv=new CustomViewPage();
			cv.clickNewContactsBtn();
			
			wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createContactTitle"),"Create contact Page");
			
			CreateContacts cc = new CreateContacts();
			cc.
			
			CreateLeadPage cl=new CreateLeadPage();
			cl.createLeadWithMandatoryDetails(flib.readExcelData(EXCEL_PATH, "Leads", 0, 1),
					flib.readExcelData(EXCEL_PATH, "Leads", 1, 1));
			
			wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "leadDetailsTitle"), "Leads Details page");
			bt.closeBrowser();	
				
			}
		
	}

}
