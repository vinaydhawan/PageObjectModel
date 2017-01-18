package com.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectFlightPage {

static WebDriver driver;
	
	@FindBy(how = How.NAME, using = "reserveFlights")
	WebElement reserveFlights_Button;
	
	public SelectFlightPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void SelectFlightDetails() throws Exception {
		// enter the details on the find flight page
		reserveFlights_Button.click();
		Thread.sleep(4000);		
	}
	
	
}
