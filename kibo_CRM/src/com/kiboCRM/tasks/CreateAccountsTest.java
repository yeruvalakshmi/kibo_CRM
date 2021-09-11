package com.kiboCRM.tasks;

import org.testng.annotations.Test;

import com.kiboCRM.genericLibs.BaseTest;
import com.kiboCRM.genericLibs.FileLib;
import com.kiboCRM.genericLibs.WebDriverCommonLib;
import com.kiboCRM.pages.HomePage;
import com.kiboCRM.pages.LoginPage;

public class CreateAccountsTest extends BaseTest {

	@Test
		public void CreatedAccountsTest() throws Throwable {
		
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "HomePage");
		
	
		
		
		
		
	}

}
