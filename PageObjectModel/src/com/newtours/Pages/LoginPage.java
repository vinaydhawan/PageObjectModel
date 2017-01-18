/*package com.newtours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//initializing page objects
	By Username=By.name("userName");
	By Password=By.name("password");
	By SignInButton=By.name("login");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	// Login Functionality Check
	public void MercuryAppLogin(String Username1,String Password1)
	{
		driver.findElement(Username).sendKeys(Username1);
		driver.findElement(Password).sendKeys(Password1);
		driver.findElement(SignInButton).click();
		driver.quit();
	}
	
}*/
