package com.Mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;



public class HomePageTest extends BaseTest {
	public HomePageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority=1)
	public void VerifyHomePageTitle()
	{
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("edusmartteacher8", "edusmartteacher8", "Edusmart");
		String homePageTitle = homepage.HomePageTitle();
		Assert.assertEquals(homePageTitle, "Edusmart","Title Mismatched");
	
		
	}
	@Test(priority=2)
	public void VerifyWorkspacelink()
	{
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("edusmartteacher8", "edusmartteacher8", "Edusmart");
		homepage.clickworkspace();
		System.out.println("Workspace link working");
		//Assert.assertTrue(homepage.clickworkspace());
	}
	
	@Test
	public void Verifycontentlink()
	{
		System.out.println("Verify content link");
	}
}
