package com.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	static WebDriver driver;
	
	@FindBy(how=How.NAME,using="userName")
	@CacheLookup
			WebElement username;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
			WebElement password;
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	@CacheLookup
			WebElement SignIn;
	
	
	// creating a constructor for driver class
	public LoginPageNew(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// creating a Login validation function
	public void MercuryAppLogin(String Username1,String Password1) throws Exception
	{
		username.sendKeys(Username1);
		password.sendKeys(Password1);
		SignIn.click();
		Thread.sleep(5000);
		}

	public static boolean VerifyPageTitle() {
		// TODO Auto-generated method stub
		String Pagetitle=driver.getTitle();
		return Pagetitle.contains("Find a Flight: Mercury Tours:");
	}
	

}
