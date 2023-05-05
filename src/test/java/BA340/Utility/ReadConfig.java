package BA340.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	//Load properties file

	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	//load variables

	//For Login Test
	
	public String ApplicationURL()
	{
		String AppURL = pro.getProperty("ApplicationURL");
		return AppURL;
	}
	
	public String Username()
	{
		String UN = pro.getProperty("Username");
		return UN;
	}
	
	public String Password()
	{
		String PW = pro.getProperty("Password");
		return PW;
	}
	
	public String PageHeading()
	{
		String PT = pro.getProperty("Heading");
		return PT;
	}
	
	public String ExpURL()
	{
		String EP = pro.getProperty("ExpectedURL");
		return EP;
	}
	
	public String ExpTitle()
	{
		String Exptitle = pro.getProperty("ExpectedTitle");
		return Exptitle;
	}
	
	//For Create Account Test
	
	public String ExpTitle1()
	{
		String ET1 = pro.getProperty("ExpectedTitle1");
		return ET1;
	}
	
	public String ExpURL1()
	{
		String EURL1 = pro.getProperty("ExpectedURL1");
		return EURL1;
	}
	
	public String PageHeading1()
	{
		String PH1 = pro.getProperty("Heading1");
		return PH1;
	}
	
	public String UserName1()
	{
		String UN1 = pro.getProperty("Username1");
		return UN1;
	}
	
	public String PassWord1()
	{
		String PW1 = pro.getProperty("Password1");
		return PW1;
	}
	 
	public String CnnfirmPassword()
	{
		String CPW1 = pro.getProperty("ConfirmPass");
		return CPW1;
	}
	
	public String Email()
	{
		String email = pro.getProperty("Email");
		return email;
	}
	
	public String Phoneno()
	{
		String PN = pro.getProperty("PhoneNo");
		return PN;
	}
	
	public String Dept()
	{
		String dept = pro.getProperty("Department");
		return dept;
	}
	
	public String Descrp()
	{
		String Desp = pro.getProperty("Description");
		return Desp;
	}
	
	public String fname()
	{
		String FN = pro.getProperty("FirstN");
		return FN;
	}
	
	public String lname()
	{
		String LN = pro.getProperty("LastN");
		return LN;
	}
	
	
	//for Profile Page
	
	public String ExpTitle2()
	{
		String ET2 = pro.getProperty("ExpectedTitle2");
		return ET2;
	}
	
	public String EURL2()
	{
		String EURL2 = pro.getProperty("ExpectedURL2");
		return EURL2;
	}
	
	public String PageHeading2()
	{
		String PH2 = pro.getProperty("Heading2");
		return PH2;
	}
	
	//For Forgot Page
	
	public String PageHeading3()
	{
		String PH3 = pro.getProperty("Heading3");
		return PH3;
	}
	
	//For Change Password
	
	public String PageHeading4()
	{
		String PH4 = pro.getProperty("Heading4");
		return PH4;
	}
	
	public String ExpTitle4()
	{
		String ET4 = pro.getProperty("ExpectedTitle4");
		return ET4;
	}
	
	public String EURL4()
	{
		String EURL4 = pro.getProperty("ExpectedURL4");
		return EURL4;
	}
	
	public String OP()
	{
		String OldP = pro.getProperty("OldPass");
		return OldP;
	}
	
	public String NP()
	{
		String NewP = pro.getProperty("NewPass");
		return NewP;
	}
	
	public String CP()
	{
		String ConP = pro.getProperty("ConPass");
		return ConP;
	}

}
