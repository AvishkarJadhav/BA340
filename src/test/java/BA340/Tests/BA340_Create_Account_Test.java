package BA340.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BA340.Utility.Utility;
@Listeners(listners.Listners.class)
public class BA340_Create_Account_Test extends Base {
  @Test 
  public void ValidatingCreateAccountPage() throws InterruptedException {
	
	  Thread.sleep(2000);
	  
	  soft.assertEquals(ExpTitle1, driver.getTitle());
	  Reporter.log("Validating page title", true);

	  lg.clickOnCreateAccLink();
	  Thread.sleep(2000);
	  
	  ca.SelectUserType();
	  Thread.sleep(1000);

	  ca.enterUserName(UN1);
	  Thread.sleep(1000);

	  ca.enterFirstName(FN);
	  Thread.sleep(1000);

	  ca.enterLastName(LN);
	  Thread.sleep(1000);

	  ca.enterPass(PW1);
	  Thread.sleep(1000);

	  ca.enterConfirmPass(CPW1);
	  Thread.sleep(1000);

	  ca.enterEmail(Email);
	  Thread.sleep(1000);

	  ca.enterPhoneNo(PhoneNo);
	  Thread.sleep(1000);

	  ca.enterDept(Dept);
	  Thread.sleep(1000);

	  ca.enterDescription(Descp);
	  Thread.sleep(1000);
	  
	  ca.selectTimeZone();
	  Thread.sleep(2000);
	  
//	  ca.clickOnResetBT();
//	  Thread.sleep(2000);
	  
	  ca.clickOnCreateBT();
	  Thread.sleep(2000);
	  
	  soft.assertEquals(EURL1, driver.getCurrentUrl());
	  Reporter.log("Validating current URL", true);
  }
  
  @Test
  public void validatingErrorMessages1() throws InterruptedException
  {
	  Thread.sleep(2000);

	  lg.clickOnCreateAccLink();
	  
	  Thread.sleep(2000);

	  ca.clickOnUsername1();
	  Thread.sleep(1000);

	  ca.clickOnFname();
	  Thread.sleep(1000);

	  ca.clickOnlname();
	  Thread.sleep(1000);

	  ca.clickOnPass();
	  Thread.sleep(1000);

	  ca.clickOnConPass();
	  Thread.sleep(1000);

	  ca.clickOnEmail();
	  Thread.sleep(1000);

	  ca.clickOnPhoneno();
	  Thread.sleep(1000);

	  ca.clickOnDept();
	  Thread.sleep(1000);

	  ca.clickOnDescp();
	  Thread.sleep(1000);
	  
	  ca.clickOnUsername1();
	  Thread.sleep(1000);


	  Reporter.log("Leaving all fields blank and ckecking appearance of error message", true);

  }
  
  @Test
  public void validatingCreateAccountwithInvalidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
  {	  
	  Thread.sleep(1000);
	  
	  lg.clickOnCreateAccLink();
	  Thread.sleep(1000);

	  ca.SelectUserType();
	  Thread.sleep(2000);

	  for(int i=13;i<=17;i++)
	  {
		  ca.enterUserName(Utility.readDataFromExcel(i, 7));
		  Thread.sleep(1000);

		  ca.enterFirstName(Utility.readDataFromExcel(i, 1));
		  Thread.sleep(1000);

		  ca.enterLastName(Utility.readDataFromExcel(i, 2));
		  Thread.sleep(1000);

		  ca.enterPass(Utility.readDataFromExcel(i, 3));
		  Thread.sleep(1000);

		  ca.enterConfirmPass(Utility.readDataFromExcel(i, 4));
		  Thread.sleep(1000);

		  ca.enterEmail(Utility.readDataFromExcel(i, 5));
		  Thread.sleep(1000);

		  ca.enterPhoneNo(Utility.readDataFromExcel(i, 6));
		  Thread.sleep(3000);
		  
		  Utility.Screenshot(driver, "CAInvalidCred");
		  Thread.sleep(3000);

		  Reporter.log("Validating Create Account Page with Invalid credentials", true);
	  }
	  

  }
}
