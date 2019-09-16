package com.Mytests;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.*;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends BaseTest{
	

	public LoginTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=1,enabled=true)
	public void VerifyLoginPageTitleTest()
	{
		String actual_title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(actual_title);
		Assert.assertEquals(actual_title, "Edusmart LMS");
		
	}
	
	@Test(priority=2, enabled=true)
	public void VerifyLoginPageHeaderTest()
	{
		String loginpageHeader = page.getInstance(LoginPage.class).getLoginpageHeader();
		System.out.println(loginpageHeader);
		Assert.assertEquals(loginpageHeader, "Announcements");	
	}
	
	@Test(priority=3)
	public void doLoginTest()
	{
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("edusmartteacher8", "edusmartteacher8","Edusmart");
		String headerhome = homepage.getHomePageHeader();
		System.out.println(headerhome);
		Assert.assertEquals(headerhome, "Welcome Edusmart.");	
		
		//page.getInstance(LoginPage.class).doLogin();
	}
	


}
