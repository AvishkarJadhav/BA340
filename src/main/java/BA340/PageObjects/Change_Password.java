package BA340.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Password {
	
	@FindBy(xpath = "//span[text()='Change Password']")private WebElement ChangePass;
	
	@FindBy(xpath = "//h2[text()='Change Password']")private WebElement Heading;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")private WebElement oldpassword;
	
	@FindBy(xpath = "(//i[@class='fas fa-eye-slash'])[1]")private WebElement eyeIconForOP;
	
	@FindBy(xpath = "//input[@type='password']")private WebElement newpassword;
	
	@FindBy(xpath = "//input[@type='password']")private WebElement NP;
	
	@FindBy(xpath = "(//i[@class='fas fa-eye-slash'])")private WebElement eyeIconForNP;
	
	@FindBy(xpath = "(//input[@type='password'])[last()]")private WebElement confirmpassword;
	
	@FindBy(xpath = "(//i[@class='fas fa-eye-slash'])[last()]")private WebElement eyeIconForCP;
	
	@FindBy(xpath = "//button[text()='Submit']")private WebElement submitBT;
	
	public Change_Password(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnChangePass()
	{
		ChangePass.click();
	}
	
	public String validatePageHeading()
	{
		String PH4 = Heading.getText();
		return PH4;
	}
	
	public void enterOldPass(String OldPass)
	{
		oldpassword.clear();
		oldpassword.sendKeys(OldPass);
	}
	
	public void clickOnOP()
	{
		oldpassword.click();
	}
	
	public void clickOnEyeIconforOP()
	{
		eyeIconForOP.click();
	}
	
	public void enterNewPass(String NewPass)
	{
		newpassword.clear();
		newpassword.sendKeys(NewPass);
	}
	
	public void clickOnNP()
	{
		NP.click();
	}
	
	public void clickOnEyeIconForNP()
	{
		eyeIconForNP.click();
	}
	
	public void enterConfirmPass(String ConfirmPass)
	{
		confirmpassword.clear();
		confirmpassword.sendKeys(ConfirmPass);
	}
	
	public void clickOnCP()
	{
		confirmpassword.click();
	}
	
	public void clickOnEyeIconForCP()
	{
		eyeIconForCP.click();
	}
	
	public void clickOnSubmitBT()
	{
		submitBT.click();
	}
}