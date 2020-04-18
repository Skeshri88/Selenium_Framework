package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBaseGemrany;
import com.qa.pages.GermanyLoginPage;
import com.qa.pages.GermanyRegisterPage;
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
	public void testRegister() 
	{
		GermanyLoginPage germanyloginpage= new GermanyLoginPage ();
		germanyloginpage.RegisterClick();
		
		
		GermanyRegisterPage germanyregisterpage= new GermanyRegisterPage();
		germanyregisterpage.acceptCookies();
		germanyregisterpage.FemaleClick();
		germanyregisterpage.FirstNameEnter();
		germanyregisterpage.LastNameEnter();
		germanyregisterpage.EmailEnter();
		germanyregisterpage.PasswordEnter();
		germanyregisterpage.ConfirmPasswordEnter();
		germanyregisterpage.DayBirthdayEnter();
		germanyregisterpage.MonthBirthdayEnter();
		germanyregisterpage.YearBirthdayEnter();
		germanyregisterpage.CountrySelection();
		germanyregisterpage.AddressEnter();
		germanyregisterpage.PostEnter();
		germanyregisterpage.SubmitClick();
		
		
		
		
		
		
		
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}


}
