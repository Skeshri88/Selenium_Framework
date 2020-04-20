package com.qa.testcaases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBaseGemrany;
import com.qa.pages.GermanyLoginPage;
import com.qa.pages.GermanyRegisterPage;
import com.qa.pages.GermanyRegisterPages;
import com.qa.pages.UKLoginPage;
import com.qa.pages.UKRegisterPage;

public class GermanyRegister extends TestBaseGemrany
{
	
	public GermanyRegister()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	
	@Test(priority=1)
	public void testRegister() throws InterruptedException 
	{
		GermanyLoginPage germanyloginpage= new GermanyLoginPage ();
		germanyloginpage.RegisterClick();
		
		
		GermanyRegisterPages germanyregisterpages = new GermanyRegisterPages();
		germanyregisterpages.FemaleClick();
		germanyregisterpages.FirstNameEnter();
		germanyregisterpages.LastNameEnter();
		germanyregisterpages.EmailEnter();
		germanyregisterpages.PasswordEnter();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(700,0)", "");
		germanyregisterpages.ConfirmPasswordEnter();
		germanyregisterpages.DayBirthdayEnter();
		germanyregisterpages.MonthBirthdayEnter();
		germanyregisterpages.YearBirthdayEnter();
		germanyregisterpages.AcceptCookiesClick();
		germanyregisterpages.CountrySelection();
		germanyregisterpages.AddressEnter();
		germanyregisterpages.PostEnter();
		germanyregisterpages.CityEnter();
		germanyregisterpages.SubmitClick();
		Thread.sleep(5000);	
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}


}
