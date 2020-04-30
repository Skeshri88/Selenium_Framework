package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.base.TestBaseLanguage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;
import com.qa.pages.WelcomePage;
import com.qa.util.TestUtil;



public class LoginValidationTest extends TestBaseLanguage 
{
	LoginPage loginpage;
	
	public LoginValidationTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		testUtil = new TestUtil();
		LoginPage loginpage= new LoginPage();
	
	}
	
	@DataProvider
	public Object[][] getLoginTestData()
	{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider="getLoginTestData")
	public void Testligin(String Username, String PassWord)
	{
		loginpage.LoginTest(Username, PassWord);
	}
	
	
	
	 
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	


}
