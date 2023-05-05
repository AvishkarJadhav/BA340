package BA340.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BA340.Utility.Utility;
@Listeners(listners.Listners.class)
public class BA340_Login_Test extends Base {
  @Test 
  public void ValidatingLoginPage() throws InterruptedException {
	  
	  soft.assertEquals(ExpTitle, driver.getTitle());
	  Reporter.log("Validating page title", true);
	  
	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);
	  
	  lg.clickOnLoginBT();
	  Thread.sleep(1000);
	  Reporter.log("Passed valid credentials and proceed for further validation", true);

	  soft.assertEquals(PageT, lg.ValidatePageHeading());
	  Reporter.log("Page Heading validation", true);
	 
	  Thread.sleep(4000);
	  
	  soft.assertEquals(ExpUrl, driver.getCurrentUrl());
	  Reporter.log("Validating current URL", true);
	  
	  soft.assertAll();
  }
  
  @Test 
  public void validatingErrorMessages() throws InterruptedException
  {

	  lg.clickOnUsernameField();
	  Thread.sleep(1000);
	  
	  lg.clickOnPasswordField();
	  Thread.sleep(1000);
	  
	  lg.clickOnUsernameField();
	  Thread.sleep(1000);

	  Reporter.log("Leaving username and password fields blank", true);
	 
  }
  
  @Test 
  public void validatingLoginPagewithInvalidCredentials() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  
	  for(int i=3;i<=7;i++)
	  {
	  lg.enterUsername(Utility.readDataFromExcel(i, 1));
	  Thread.sleep(1000);

	  lg.enterPassword(Utility.readDataFromExcel(i, 2));
	  Thread.sleep(1000);
	  
	  lg.clickOnEyeIcon();
	  Thread.sleep(2000);

	  lg.clickOnLoginBT();
	  Thread.sleep(2000);
	  
	  Utility.Screenshot(driver, "InvalidCred");
	  Thread.sleep(3000);
	  
	  lg.clickOnEyeIconAfter();
	  Thread.sleep(1000);

	  }

	  Reporter.log("Validating login page with Invalid credentials", true);
  }
  
  @Test
  public void validatingRemainingElements() throws InterruptedException
  {
	  lg.clickOnEyeIcon();
	  Thread.sleep(1000);

	  lg.clickOnForgotPass();
	  Thread.sleep(3000);

	  driver.navigate().back();
	  Thread.sleep(1000);

	  lg.clickOnCreateAccLink();
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	  Thread.sleep(1000);
  }
}