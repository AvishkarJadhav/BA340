package BA340.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account {
	
	@FindBy(xpath = "(//span[text()='Local'])[1]")private WebElement usertypedropdown;
	
	@FindBy(xpath = "(//span[text()='Local'])[last()]")private WebElement local;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")private WebElement username;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement lastname;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")private WebElement password;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")private WebElement confirmpass;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")private WebElement email;
	
	@FindBy(xpath = "//input[@type='tel']")private WebElement phoneNo;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")private WebElement dept;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")private WebElement description;
	
	@FindBy(xpath = "//span[text()='empty']")private WebElement timezone;
	
	@FindBy(xpath = "//span[text()='Indian/Mahe']")private WebElement IST;
	
	@FindBy(xpath = "//button[text()='Create ']")private WebElement createBT;
	
	@FindBy(xpath = "//button[text()='Reset ']")private WebElement resetBT;
	
	@FindBy(xpath = "//a[text()='Back to login']")private WebElement loginpagelink;
	
	public Create_Account(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectUserType() throws InterruptedException
	{
		usertypedropdown.click();
		Thread.sleep(1000);
		local.click();
		
	}
	
	public void enterUserName(String UserName)
	{
		username.clear();
		username.sendKeys(UserName);
	}
	
	public void enterFirstName(String FirstName)
	{
		firstname.clear();
		firstname.sendKeys(FirstName);
	}

	public void enterLastName(String LastName)
	{
		lastname.clear();
		lastname.sendKeys(LastName);
	}
	
	public void enterPass(String Pass)
	{
		password.clear();
		password.sendKeys(Pass);
	}
	
	public void enterConfirmPass(String ConfirmPass)
	{
		confirmpass.clear();
		confirmpass.sendKeys(ConfirmPass);
	}
	
	public void enterEmail(String Email)
	{
		email.clear();
		email.sendKeys(Email);
	}
	
	public void enterPhoneNo(String PhoneNo)
	{
		phoneNo.clear();
		phoneNo.sendKeys(PhoneNo);
	}
	
	public void enterDept(String Dept)
	{
		dept.clear();
		dept.sendKeys(Dept);
	}
	
	public void enterDescription(String Description)
	{
		description.clear();
		description.sendKeys(Description);
	}
	
	public void selectTimeZone() throws InterruptedException
	{
		timezone.click();
		Thread.sleep(1000);
		IST.click();
	}
	
	public void clickOnCreateBT()
	{
		createBT.click();
	}
	
	public void clickOnResetBT()
	{
		resetBT.click();
	}
	
	public void clickOnUsername1()
	{
		username.click();
	}
	
	public void clickOnFname()
	{
		firstname.click();
	}
	
	public void clickOnlname()
	{
		lastname.click();
	}
	
	public void clickOnPass()
	{
		password.click();
	}
	
	public void clickOnConPass()
	{
		confirmpass.click();
	}
	
	public void clickOnEmail()
	{
		email.click();
	}
	
	public void clickOnPhoneno()
	{
		phoneNo.click();
	}
	
	public void clickOnDept()
	{
		dept.click();
	}
	
	public void clickOnDescp()
	{
		description.click();
	}
	
	public void clickOnloginPageLink()
	{
		loginpagelink.click();
	}
}