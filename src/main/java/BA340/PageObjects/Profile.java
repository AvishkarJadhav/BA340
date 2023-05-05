package BA340.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	@FindBy(xpath = "//h2[text()='User Profile']")private WebElement Heading;

	@FindBy(xpath = "//span[text()='About ']")private WebElement about;
	
	@FindBy(xpath = "//i[@class='pi pi-question-circle']")private WebElement adminGuide;
	
	@FindBy(xpath = "//div[@class='avatar']")private WebElement avatarIcon;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement usertype;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")private WebElement firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement lastname;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement username;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")private WebElement role;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")private WebElement email;
	
	@FindBy(xpath = "//input[@type='tel']")private WebElement mobileNo;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")private WebElement dept;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")private WebElement userdescription;
	
	@FindBy(xpath = "//button[text()='Update']")private WebElement updateBT;
	
	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageHeading()
	{
		String Heading4 = Heading.getText();
		return Heading4;
	}
	
	public void clickOnAbout()
	{
		about.click();
	}
	
	public void clickOnGuideIcon(WebDriver driver)
	{
		//adminGuide.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", adminGuide);

	}
	
	public void clickOnAvatar()
	{
		avatarIcon.click();
	}
	
	public void enterUserType(String Usertype)
	{
		usertype.clear();
		usertype.sendKeys(Usertype);
	}
	
	public void clickOnUsertype()
	{
		usertype.click();
	}
	
	public void enterFname(String Fname)
	{
		firstname.clear();
		firstname.sendKeys(Fname);
	}
	
	public void clickOnFname()
	{
		firstname.clear();
		firstname.click();
	}
	
	public void enterLname(String Lname)
	{
		lastname.clear();
		lastname.sendKeys(Lname);
	}
	
	public void clickOnLname()
	{
		lastname.clear();
		lastname.click();
	}
	
	public void enterUname(String Uname)
	{
		username.clear();
		username.sendKeys(Uname);
	}
	
	public void clickOnUsername()
	{
		username.clear();
		username.click();
	}
	
	public void enterRole(String Role)
	{
		role.clear();
		role.sendKeys(Role);
	}
	
	public void clickOnRole()
	{
		role.click();
	}
	
	public void enterEmail(String mail)
	{
		email.clear();
		email.sendKeys(mail);
	}
	
	public void clickOnEmail()
	{
		email.clear();
		email.click();
	}
	
	public void enterMobileNo(String MoNo)
	{
		mobileNo.clear();
		mobileNo.sendKeys(MoNo);
	}
	
	public void clickOnPhoneNo()
	{
		mobileNo.clear();
		mobileNo.click();
	}
	
	public void enterDept(String Dept)
	{
		dept.clear();
		dept.sendKeys(Dept);
	}
	
	public void clickOnDept()
	{
		dept.click();
	}
	
	public void enterUserDescription(String UserDescription)
	{
		userdescription.clear();
		userdescription.sendKeys(UserDescription);
	}
	
	public void clickOnDescp()
	{
		userdescription.clear();
		userdescription.click();
	}
	
	public void clickOnUpdate()
	{
		updateBT.click();
	}
	
}