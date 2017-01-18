package com.newtours.Pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FlightConfirmationpage {
	static WebDriver driver;
	
	@FindBy(how = How.XPATH, using ="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")
	public WebElement FlightConfMsg;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]")
	public WebElement flightConfNumber;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	public WebElement SignoffLink;

	
	
	
	// creating a constructor
	
	public FlightConfirmationpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void FlightConfirmationDetails() throws Exception {
		// enter the details on the Book flight page
		String number1=flightConfNumber.getText();
		System.out.println(number1);
		String FlightConfirmationNumber=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]")).getText();
		System.out.println(FlightConfirmationNumber);
		Thread.sleep(4000);
		SignoffLink.click();
	}

	public static boolean VerifypageTitle()
	{
		String FlightConfirmationMsg=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		System.out.println(FlightConfirmationMsg);
		return FlightConfirmationMsg.contains("Your itinerary has been booked!");
		//
	}
// 



}
