package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private By homeheader=By.xpath("//span[contains(text(),'Welcome')]");	
	private By Workspace=By.xpath("//a[@id='lnkWorkSpace']");
	public WebElement getWorkspace() {
		return getElement(Workspace);
	}
	public HomePage(WebDriver driver) {
		super(driver);
	}
	/*
	public WebElement getHomeheader() {
		return getElement(homeheader);
	}
	*/
	public String HomePageTitle()
	{
		return getPageTitle();
	}
	
	public String getHomePageHeader()
	{
		driver.switchTo().frame("lmsFrame");
		return getPageHeader(homeheader);
		
	}
	
	public void clickworkspace()
	{
		getWorkspace().click();
	}

}
