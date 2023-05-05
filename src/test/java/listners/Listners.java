package listners;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BA340.Tests.Base;
import BA340.Utility.Utility;
import net.bytebuddy.utility.RandomString;

public class Listners extends Base implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			String rts = RandomString.make(4);
			Utility.Screenshot(driver, result.getName()+rts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test case "+result.getName()+" is passed , Good job!", true);

	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test case "+result.getName()+" is skipped , Try again!", true);

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			String rts = RandomString.make(4);
			Utility.Screenshot(driver, result.getName()+rts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test case "+result.getName()+" is failed , Try again!", true);
	}
}
