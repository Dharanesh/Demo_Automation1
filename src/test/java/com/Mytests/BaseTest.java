package com.Mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Pages.BasePage;
import Pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUpTest(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equals("ff"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else
		{
			System.out.println("no browser is defined in XML file:");
		}
		
		driver.get("https://lms.edusmart.com");
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		page=new BasePage(driver);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
