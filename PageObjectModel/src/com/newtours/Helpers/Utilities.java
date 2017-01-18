package com.newtours.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class Utilities {
	static WebDriver driver;
	static String IEdriverPath = "D:\\Java-WorkSpace2\\Jars\\IEDriverServer_Win32_2.53.1\\";
	static String ChromedriverPath = "D:\\Java-WorkSpace2\\Jars\\chromedriver_win32\\";
	
	public static WebDriver StartBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.out.println("launching firefox browser");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else if(browsername.equalsIgnoreCase("chrome")) 
		{
			System.out.println("launching Chrome browser");
			System.setProperty("webdriver.chrome.driver", ChromedriverPath+"chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("IE")) 
		{
			System.out.println("launching IE browser");
			System.setProperty("webdriver.ie.driver", IEdriverPath+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			
		}
		driver.get(url);
		return driver;
	}
	
}
