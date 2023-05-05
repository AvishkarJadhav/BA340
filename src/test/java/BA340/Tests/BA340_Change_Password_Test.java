package BA340.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BA340.Utility.Utility;
@Listeners(listners.Listners.class)
public class BA340_Change_Password_Test extends Base {
  @Test
  public void ValidatingChangePasswordPage() throws InterruptedException 
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  p.clickOnAvatar();
	  Thread.sleep(2000);
	  
	  cp.clickOnChangePass();
	  Thread.sleep(2000);
	  
	  soft.assertEquals(ExpTitle4, driver.getTitle());
	  Thread.sleep(1000);
	  Reporter.log("Validating page title", true);
	  
	  soft.assertEquals(Heading4, cp.validatePageHeading());
	  Thread.sleep(1000);
	  Reporter.log("Page Heading validation", true);

	  soft.assertEquals(EURL4, driver.getCurrentUrl());
	  Thread.sleep(1000);
	  Reporter.log("Validating current URL", true);

	  
	  cp.enterOldPass(OldP);
	  Thread.sleep(2000);

	  cp.clickOnEyeIconforOP();
	  Thread.sleep(2000);

	  cp.enterNewPass(NewP);
	  Thread.sleep(2000);

	  cp.clickOnEyeIconForNP();
	  Thread.sleep(2000);

	  cp.enterConfirmPass(ConP);
	  Thread.sleep(2000);

	  cp.clickOnEyeIconForCP();
	  Thread.sleep(1000);
	  
//	  cp.clickOnSubmitBT();
//	  Thread.sleep(3000);

	  Reporter.log("Validating Change Password functionality", true);

  }
  
  @Test
  public void validatingErrorMessages4() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  p.clickOnAvatar();
	  Thread.sleep(2000);
	  
	  cp.clickOnChangePass();
	  Thread.sleep(2000);
	  
	  cp.clickOnOP();
	  Thread.sleep(2000);
	  
	  cp.clickOnEyeIconforOP();
	  Thread.sleep(2000);

	  cp.clickOnNP();
	  Thread.sleep(2000);
	  
	  cp.clickOnEyeIconForNP();
	  Thread.sleep(2000);

	  cp.clickOnCP();
	  Thread.sleep(2000);
	  
	  cp.clickOnEyeIconForCP();
	  Thread.sleep(2000);

	  Reporter.log("Leaving all fields blank and ckecking appearance of error message", true);
  }
  
  @Test
  public void validatingChangePasswordPagewithInvalidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  p.clickOnAvatar();
	  Thread.sleep(2000);
	  
	  cp.clickOnChangePass();
	  Thread.sleep(2000);
	  
	  Thread.sleep(1000);

	  cp.enterOldPass(Utility.readDataFromExcel(43, 1));
	  Thread.sleep(2000);

	  cp.clickOnEyeIconforOP();
	  Thread.sleep(2000);

	  cp.enterNewPass(Utility.readDataFromExcel(43, 2));
	  Thread.sleep(2000);

	  cp.clickOnEyeIconForNP();
	  Thread.sleep(2000);

	  cp.enterConfirmPass(Utility.readDataFromExcel(43, 3));
	  Thread.sleep(2000);

	  cp.clickOnEyeIconForCP();
	  Thread.sleep(2000);
	  
	  Reporter.log("Validating Change Password Page with Invalid credentials", true);

  }
}
