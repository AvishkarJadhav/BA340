package BA340.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Out {
	
	@FindBy(xpath = "//span[text()='Signout ']")private WebElement signoutlink;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")private WebElement alertYesBt;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")private WebElement alertNoBt;
	
	public Sign_Out(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignOutLink() 
	{
		signoutlink.click();
	}
	
	public void clickOnYesBT()
	{
		alertYesBt.click();
	}
	
	public void clickOnNoBT()
	{
		alertNoBt.click();
	}
}
