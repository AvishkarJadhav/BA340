package BA340.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import BA340.PageObjects.Change_Password;
import BA340.PageObjects.Create_Account;
import BA340.PageObjects.Forgot_Password;
import BA340.PageObjects.Login;
import BA340.PageObjects.Profile;
import BA340.PageObjects.Sign_Out;
import BA340.Utility.ReadConfig;

public class Base {

	//Declaration of variables 

	protected static WebDriver driver;
	
	//Global declaration of POM objects 
	Login lg;
	Create_Account ca;
	Profile p;
	Forgot_Password fp;
	Change_Password cp;
	Sign_Out so;
	
	//For assertion
	SoftAssert soft=new SoftAssert();
	
	ReadConfig readconfig=new ReadConfig();
	
	//For Login 
	public String UN=readconfig.Username();
	public String AppURL=readconfig.ApplicationURL();
	public String PW=readconfig.Password();
	public String PageT=readconfig.PageHeading();
	public String ExpUrl=readconfig.ExpURL();
	public String ExpTitle=readconfig.ExpTitle();
	
	//For Create Account
	public String UN1=readconfig.UserName1();
	public String ExpTitle1=readconfig.ExpTitle1();
	public String Heading1=readconfig.PageHeading1();
	public String PW1=readconfig.PassWord1();
	public String CPW1=readconfig.CnnfirmPassword();
	public String Email=readconfig.Email();
	public String EURL1=readconfig.ExpURL1();
	public String PhoneNo=readconfig.Phoneno();
	public String Dept=readconfig.Dept();
	public String Descp=readconfig.Descrp();
	public String FN=readconfig.fname();
	public String LN=readconfig.lname();
	
	//For Profile
	public String ExpTitle2=readconfig.ExpTitle2();
	public String EURL2=readconfig.EURL2();
	public String Heading2=readconfig.PageHeading2();
	
	//For Forgot Password
	public String Heading3=readconfig.PageHeading3();
	
	//For Change Password
	public String ExpTitle4=readconfig.ExpTitle4();
	public String EURL4=readconfig.EURL4();
	public String Heading4=readconfig.PageHeading4();
	public String OldP=readconfig.OP();
	public String NewP=readconfig.NP();
	public String ConP=readconfig.CP();
	
	
	//Launching web application on Chrome browser

	@BeforeClass
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		lg=new Login(driver);
		ca=new Create_Account(driver);
		p=new Profile(driver);
		fp=new Forgot_Password(driver);
		cp=new Change_Password(driver);
		so=new Sign_Out(driver);
	}
	
	//Passing URL

	@BeforeMethod
	public void LaunchApplicationUnderTest() throws InterruptedException
	{
		driver.get(AppURL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	
	//Minimizing window after test

	@AfterMethod
	public void minimizeApplicationUnderTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}
	
	//Closing browser after test

	@AfterClass
	public void ClosingBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.close();
	}

}
