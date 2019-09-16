package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		
		return getElement(locator).getText();
	
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
			waitForElementPresent(locator);
			element=driver.findElement(locator);
			return element;
		}catch(Exception e)
		{
			System.out.println("Some error occured while creating element"+locator.toString());
			//e.printStackTrace();
			return element;
		}
		
		
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch(Exception e)
		{
			System.out.println("some exception/error accured while waiting for the element:"+locator.toString());	
		}
	}

	@Override
	public void waitForPageTitle(String Title) {
		try {
		wait.until(ExpectedConditions.titleContains(Title));
		}catch(Exception e)
		{
			System.out.println("Some Exception/Error occured while waiting for the element"+Title);
		}
		
	}

}
