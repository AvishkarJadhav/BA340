package BA340.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BA340.Utility.Utility;
@Listeners(listners.Listners.class)
public class BA340_Profile_Test extends Base {
  @Test
  public void ValidatingProfilePage() throws InterruptedException 
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(2000);
	  
	  soft.assertEquals(ExpTitle2, driver.getTitle());
	  Reporter.log("Validating page title", true);
	  Thread.sleep(1000);
	  
	  soft.assertEquals(Heading2, p.validatePageHeading());
	  Reporter.log("Page Heading validation", true);
	  Thread.sleep(1000);

	  soft.assertEquals(EURL2, driver.getCurrentUrl());
	  Reporter.log("Validating current URL", true);
	  Thread.sleep(1000);

//	  p.clickOnAbout();
//	  Thread.sleep(1000);

//	  p.clickOnAvatar();
//	  Thread.sleep(1000);
	  
//	  p.clickOnGuideIcon(driver);
//	  Thread.sleep(1000);


	  p.clickOnUsertype();
	  Thread.sleep(1000);

	  p.clickOnFname();
	  Thread.sleep(1000);
	  
	  p.enterFname(FN);
	  Thread.sleep(1000);

	  p.clickOnLname();
	  Thread.sleep(1000);
	  
	  p.enterLname(LN);
	  Thread.sleep(1000);

	  p.clickOnEmail();
	  Thread.sleep(1000);

	  p.clickOnPhoneNo();
	  Thread.sleep(1000);
	  
	  p.enterMobileNo(PhoneNo);
	  Thread.sleep(1000);


	  p.clickOnDept();
	  Thread.sleep(1000);

	  p.clickOnDescp();
	  Thread.sleep(1000);
	  
	  p.enterUserDescription(Descp);
	  Thread.sleep(1000);
	  
	  p.clickOnUpdate();
	  Thread.sleep(2000);
	  
	  p.clickOnUsertype();
	  Thread.sleep(1000);
	  
	  Reporter.log("Validating update functionality", true);
	  
  }
  
  @Test
  public void validatingErrorMessages2() throws InterruptedException
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  p.clickOnFname();
	  Thread.sleep(1000);
	  
	  p.clickOnLname();
	  Thread.sleep(1000);
	  
	  p.clickOnPhoneNo();
	  Thread.sleep(1000);
	  
	  p.clickOnDescp();
	  Thread.sleep(1000);
	  
	  Reporter.log("Leaving all fields blank and ckecking appearance of error message", true);
	  
  }
  
  @Test
  public void validatingProfilePagewithInvalidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  for(int i=23;i<=27;i++)
	  {
		  p.enterFname(Utility.readDataFromExcel(i, 1));
		  Thread.sleep(1000);

		  p.enterLname(Utility.readDataFromExcel(i, 2));
		  Thread.sleep(1000);

		  p.enterMobileNo(Utility.readDataFromExcel(i, 3));
		  Thread.sleep(1000);
		  
		  p.enterUserDescription(Utility.readDataFromExcel(i, 4));
		  Thread.sleep(1000);

		  Utility.Screenshot(driver, "ProInvalidCreds");
		  Thread.sleep(2000);
	  }
	  Reporter.log("Validating login page with Invalid credentials", true);
	  Thread.sleep(1000);

  }
}
