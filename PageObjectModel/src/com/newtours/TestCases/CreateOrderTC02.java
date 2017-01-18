package com.newtours.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.newtours.Helpers.Utilities;
import com.newtours.Pages.BookaFlightPage;
import com.newtours.Pages.FindaFlightPage;
import com.newtours.Pages.FlightConfirmationpage;
import com.newtours.Pages.LoginPageNew;
import com.newtours.Pages.SelectFlightPage;

public class CreateOrderTC02 {
	WebDriver driver;
	
	
	@Test
	public void CreateOrderTest(){
		// to initiate the browser
				WebDriver driver=Utilities.StartBrowser("firefox", "http://www.newtours.demoaut.com/");
				//to initialize the login page objects of the same class
				LoginPageNew loginpage=PageFactory.initElements(driver, LoginPageNew.class);
				// call the method for the same
				try {
					loginpage.MercuryAppLogin("mercury","mercury");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
//Navigate on the Find a Flight page
				FindaFlightPage FindFlight=PageFactory.initElements(driver, FindaFlightPage.class);
				try {
					FindFlight.EnterFlightDetails();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try{
				Assert.assertTrue(FindaFlightPage.VerifypageTitle(),"Find a Flight Page not navigated successfully");
				System.out.println("find a Flight page navigated successfully");
				}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("Closing browser");
				//driver.quit();
				
				
//Navigate to select a flight Page
				SelectFlightPage SelectFlight=PageFactory.initElements(driver, SelectFlightPage.class);
				try {
					SelectFlight.SelectFlightDetails();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//Book a Flight page
				BookaFlightPage BookFlight=PageFactory.initElements(driver, BookaFlightPage.class);
				try{
					Assert.assertTrue(BookaFlightPage.VerifypageTitle(),"Book a Flight Page not navigated successfully");
					System.out.println("Book a Flight page navigated successfully");
					//enter customer details
					BookFlight.BookFlightDetails();
					}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//Flight Confirmation page
				FlightConfirmationpage FlightConfirmation=PageFactory.initElements(driver, FlightConfirmationpage.class);
				try{
					Assert.assertTrue(FlightConfirmationpage.VerifypageTitle(),"FlightConfirmation message is not displayed");
					System.out.println("FlightConfirmation message is displayed");
					//enter customer details
					FlightConfirmation.FlightConfirmationDetails();
					}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
		
	}
	

}
