package com.newtours.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.newtours.Helpers.Utilities;
import com.newtours.Pages.LoginPageNew;

public class LoginTestNew {
	WebDriver driver;
	
	@Test
	public void CheckValidLogin() throws Exception{
		// to initiate the browser
		WebDriver driver=Utilities.StartBrowser("firefox", "http://www.newtours.demoaut.com/");
		//to initialize the login page objects of the same class
		LoginPageNew loginpage=PageFactory.initElements(driver, LoginPageNew.class);
		// call the method for the same
		loginpage.MercuryAppLogin("mercury","mercury");	
		try{
		Assert.assertTrue(LoginPageNew.VerifyPageTitle(),"Page Title doesnot match as expected");
		System.out.println("User is logged into the Application");
		}catch (Throwable e)
		{
			System.out.println("User is not logged in the Application ");
		}
		System.out.println("Closing browser");
		driver.quit();
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing browser");
			driver.quit();
		}
	}
}
