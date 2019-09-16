package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Page Locators:
	private By userId=By.name("txtUserID");
	private By password=By.name("txtPassword");
	private By District=By.id("txtDistrict");
	private By LoginBtn=By.name("btnLogin");
	private By LoginpageHeader=By.xpath("//span[contains(text(),'Announcements')]");
	
	public WebElement getUserId() {
		return getElement(userId);
	}
	
	public WebElement getPassword() {
		return getElement(password);
	}

	
	public WebElement getDistrict() {
		return getElement(District);
	}
	
	public WebElement getLoginBtn() {
		return getElement(LoginBtn);
	}
	
	public String getLoginpageHeader()
	{
		return getPageHeader(LoginpageHeader);
	}
	public String getLoginPageTitle()
	{
		return getPageTitle();
	}
	/*
	 @Username,
	 @pwd,
	 @return
	 */
	
	public HomePage doLogin(String Username,String pwd,String District )
	{
		getUserId().sendKeys(Username);
		getPassword().sendKeys(pwd);
		getDistrict().sendKeys(District);
		getLoginBtn().click();
		return getInstance(HomePage.class);
	}
	
	//method overloading:negative testing
	public void doLogin()
	{
		getUserId().sendKeys();
		getPassword().sendKeys();
		getLoginBtn().click();
	}
	//username:dharanesh@gmail.com
	public void doLogin(String usercred)
	{
		if(usercred.contains("username"))
		{
			getUserId().sendKeys(usercred.split(":")[1].trim());
		}else if(usercred.contains("password"))
		{
			getPassword().sendKeys(usercred.split(":")[1].trim());
			
		}
		
		getLoginBtn().click();
		}
		
	}
	
	
	
	
	

