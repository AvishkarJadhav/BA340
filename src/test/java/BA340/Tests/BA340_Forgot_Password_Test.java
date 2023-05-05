package BA340.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BA340.Utility.Utility;
@Listeners(listners.Listners.class)
public class BA340_Forgot_Password_Test extends Base {
  @Test
  public void ValidatingForgotPasswordPage() throws InterruptedException 
  {
	  
	  Thread.sleep(1000);
	  
	  lg.clickOnForgotPass();
	  Thread.sleep(2000);

	  soft.assertEquals(Heading3, fp.validatePageHeading());
	  Reporter.log("Page Heading validation", true);
	  Thread.sleep(2000);
	  
	  fp.enterUserName(UN1);
	  Thread.sleep(1000);

	  fp.clickOnResetBT();
	  Thread.sleep(1000);
	  
	  Reporter.log("Validating Forgot Password Page", true);
  }
  
  @Test
  public void validatingErrorMessages3() throws InterruptedException
  {
	  Thread.sleep(1000);
	  
	  lg.clickOnForgotPass();
	  Thread.sleep(2000);
	  
	  fp.clickOnUsername();
	  Thread.sleep(1000);
	  
	  fp.clickOnHeading();
	  Thread.sleep(2000);
	  
	  Reporter.log("Leaving field blank and ckecking appearance of error message", true);
  }
  
  @Test
  public void validatingForgotPasswordPagewithInvalidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  Thread.sleep(1000);
	  
	  lg.clickOnForgotPass();
	  Thread.sleep(2000);
	  
	  for(int i=33;i<=37;i++)
	  {
		  fp.enterUserName(Utility.readDataFromExcel(i, 1));
		  Thread.sleep(1000);
		  
		  fp.clickOnResetBT();
		  Thread.sleep(1000);

		  Utility.Screenshot(driver, "FPInvalidCreds");
		  Thread.sleep(1000);
	  }
	  Reporter.log("Validating Forgot Password with Invalid credentials", true);
	  Thread.sleep(1000);
  }
}
