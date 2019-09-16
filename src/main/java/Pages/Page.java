package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	public Page(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait=new WebDriverWait(this.driver,15);
	}
	
	//abstract methods:
	public abstract String getPageTitle();
	public abstract String getPageHeader(By Locator);
	public abstract WebElement getElement(By locator);
	public abstract void waitForElementPresent(By locator);
	public abstract void waitForPageTitle(String Title);
	
	public <Tpage extends BasePage>Tpage getInstance(Class<Tpage>pageClass)
	{
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	//instead of creating Loginpage=new LoginPage()--i have created above line-it is generic class to call objects af all page class
			
	}
}
