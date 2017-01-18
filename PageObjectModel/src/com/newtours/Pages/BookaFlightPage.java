package com.newtours.Pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BookaFlightPage {
	static WebDriver driver;
	
	@FindBy(how = How.NAME, using = "passFirst0")
	public WebElement Firstname;

	@FindBy(how = How.NAME, using = "passLast0")
	public WebElement Lastname;
	
	@FindBy(how=How.NAME,using="creditnumber")
	public WebElement CreditCardNumber1;
	
	@FindBy(how = How.NAME, using = "pass.0.meal")
	public WebElement MealPreference;
	
	@FindBy(how=How.NAME,using="buyFlights")
	@CacheLookup
			WebElement buyFlights_Button;
	
	
	
	// creating a constructor
	
	public BookaFlightPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void BookFlightDetails() throws Exception {
		// enter the details on the Book flight page
		
		Firstname.sendKeys("Vinay");
		Lastname.sendKeys("Dhawan");
		CreditCardNumber1.sendKeys("12345");
		Select MealDropdown = new Select(MealPreference);
		MealDropdown.selectByIndex(2); 
		buyFlights_Button.click();
	}

	public static boolean VerifypageTitle()
	{
		String BookPageTitle=driver.getTitle();
		return BookPageTitle.contains("Book a Flight: Mercury Tours");
		//
	}
// 



}
