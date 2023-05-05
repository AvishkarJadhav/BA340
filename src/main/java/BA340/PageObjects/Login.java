package BA340.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath = "//h3[text()='Log in to your account']")private WebElement heading;
	
	@FindBy(xpath = "//input[@type='text']")private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")private WebElement password;
	
	@FindBy(xpath = "//i[@class='fas fa-eye-slash']")private WebElement eyeslashIcon;
	
	@FindBy(xpath = "//i[@class='fas fa-eye']")private WebElement eyeIconAfter;
	
	@FindBy(xpath = "//div[@role='checkbox']")private WebElement rememberMeCB;
	
	@FindBy(xpath = "//p[text()='Forgot password?']")private WebElement forgotpasslink;
	
	@FindBy(xpath = "//button[@class='btn login-btn']")private WebElement loginBT;
	
	@FindBy(xpath = "//p[text()='Create Account']")private WebElement createAccLink;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidatePageHeading()
	{
		String Heading = heading.getText();
		return Heading;
	}
	
	public void enterUsername(String Name)
	{
		username.clear();
		username.sendKeys(Name);
	}
	
	public void clickOnUsernameField()
	{
		username.click();
	}
	
	public void enterPassword(String Pass)
	{
		password.clear();
		password.sendKeys(Pass);
	}
	
	public void clickOnPasswordField()
	{
		password.click();
	}
	
	public void clickOnEyeIcon()
	{
		eyeslashIcon.click();
	}
	
	public void clickOnEyeIconAfter()
	{
		eyeIconAfter.click();
	}
	
	public void markRememberMe()
	{
		rememberMeCB.click();
	}
	
	public void clickOnForgotPass()
	{
		forgotpasslink.click();
	}
	
	public void clickOnLoginBT()
	{
		loginBT.click();
	}
	
	public void clickOnCreateAccLink()
	{
		createAccLink.click();
	}
	
}