package com.newtours.Pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FindaFlightPage {
	static WebDriver driver;
	
	@FindBy(how = How.CSS, using = "[type='radio'][value='roundtrip']")
	public WebElement roundTrip;

	@FindBy(how = How.CSS, using = "[type='radio'][value='oneway']")
	public WebElement oneWay;
	
	@FindBy(how=How.NAME,using="passCount")
	   public WebElement passCount;
	
	@FindBy(how = How.CSS, using = "[type='radio'][value='Business']")
	public WebElement BusinessClass;
	
	@FindBy(how=How.NAME,using="findFlights")
	@CacheLookup
			WebElement findFlights_Button;
	
	
	
	// creating a constructor
	
	public FindaFlightPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void EnterFlightDetails() throws Exception {
		// enter the details on the find flight page
		oneWay.click();
		Select drop = new Select(passCount);
	      drop.selectByIndex(2); 
		BusinessClass.click();
		findFlights_Button.click();
		Thread.sleep(4000);		
	}

	public static boolean VerifypageTitle()
	{
		String Title2=driver.getTitle();
		return Title2.contains("Select a Flight: Mercury Tours");	
	}
// 



}
