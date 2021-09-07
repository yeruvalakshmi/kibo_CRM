package com.kiboCRM.genericLibs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverCommonLib {
	
	public String getPageTitle() {
		String pageTitle=BaseTest.driver.getTitle();
		return pageTitle;
	}
   public void verify(String actual,String expected,String page) {
	   if(actual.equals(expected)) {
		   System.out.println(page + "is displayed,PASS");
	   }
	   else {
		   System.out.println(page + "is not displayed,FAIL");
	   }
   }
   public void selectOption(WebElement element,int index) {
	   Select sel = new Select(element);
	   sel.selectByIndex(index);
   }
   public void selectOption(WebElement element,String value) {
	   Select sel = new Select(element);
	   sel.selectByValue(value);
   }
   public void selectOption(String text,WebElement element) {
	  Select sel = new Select(element);
	  sel.selectByVisibleText(text);
   }
   public void mouseHover(WebElement element) {
	  Actions ac = new Actions(BaseTest.driver);
	  ac.moveToElement(element).perform();
   }
 public void rightClick(WebElement element) {
	 Actions ac = new Actions(BaseTest.driver);
	 ac.contextClick(element).perform();
 }
 public void dragAndDropElement(WebElement source,WebElement target) {
	Actions ac = new Actions(BaseTest.driver);
	ac.dragAndDrop(source, target).perform();
 }
 public void getFullPageScreenshot(String screenshotPath) {
	 
	 TakesScreenshot ts=(TakesScreenshot) BaseTest.driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(screenshotPath);
	 try {
		 Files.copy(src, dest);
	 }catch (IOException e) {
		 e.printStackTrace();
	 }
	 
 }
 
}






























