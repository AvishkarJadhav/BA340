package BA340.Tests;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.Listners.class)
public class BA340_SignOut_Test extends Base {
  @Test
  public void ValidatingSignOutPage() throws InterruptedException 
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  p.clickOnAvatar();
	  Thread.sleep(3000);
	  
	  so.clickOnSignOutLink();
	  Thread.sleep(3000);
	  
	  so.clickOnYesBT();
	  Thread.sleep(2000);
	  
	  Reporter.log("Validating Sign Out functionality", true);

  }
  
  @Test
  public void ValidatingSignOutPageNegativeScenario() throws InterruptedException 
  {
	  Thread.sleep(1000);

	  lg.enterUsername(UN);
	  Thread.sleep(1000);
	  
	  lg.enterPassword(PW);
	  Thread.sleep(1000);

	  lg.clickOnLoginBT();
	  Thread.sleep(3000);
	  
	  p.clickOnAvatar();
	  Thread.sleep(3000);
	  
	  so.clickOnSignOutLink();
	  Thread.sleep(3000);
	  
	  so.clickOnNoBT();
	  Thread.sleep(2000);
	  
	  Reporter.log("Validating Sign Out functionality", true);

  }

}
