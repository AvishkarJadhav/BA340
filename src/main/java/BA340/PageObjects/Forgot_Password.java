package BA340.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_Password {
	
	@FindBy(xpath = "//h3[text()='Reset Your Password']")private WebElement pageHeading;
	
	@FindBy(xpath = "//input[@type='text']")private WebElement username;
	
	@FindBy(xpath = "//button[text()=' Reset Password']")private WebElement resetBT;
	
	@FindBy(xpath = "//a[text()='Back to login']")private WebElement loginpagelink;
	
	public Forgot_Password(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String validatePageHeading()
	{
		String PageH = pageHeading.getText();
		return PageH;
	}
	
	public void clickOnHeading()
	{
		pageHeading.click();
	}
	
	public void enterUserName(String UserName)
	{
		username.clear();
		username.sendKeys(UserName);
	}
	
	public void clickOnUsername()
	{
		username.click();
	}
	
	public void clickOnResetBT()
	{
		resetBT.click();
	}
	
	public void clickOnLoginPageLink()
	{
		loginpagelink.click();
	}
}