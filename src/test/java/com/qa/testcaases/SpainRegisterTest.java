package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBaseGemrany;
import com.qa.base.TestBaseSpain;
import com.qa.pages.GermanyLoginPage;
import com.qa.pages.GermanyRegisterPage;
import com.qa.pages.SpainLoginPage;
import com.qa.pages.SpainRegisterPage;

public class SpainRegisterTest extends TestBaseSpain
{
	
		
		public SpainRegisterTest()
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
			SpainLoginPage spainloginpage= new SpainLoginPage ();
			spainloginpage.RegisterClick();
			
			
			SpainRegisterPage spainregisterpage= new SpainRegisterPage();
			spainregisterpage.GenderSelection();
			spainregisterpage.FirstNameEnter();
			spainregisterpage.middleNameEnter();
			spainregisterpage.LastNameEnter();
			spainregisterpage.EmailEnter();
			spainregisterpage.PasswordEnter();
			spainregisterpage.ConfirmPasswordEnter();
			spainregisterpage.DayBirthDaySelection();
			spainregisterpage.MonthBirthDaySelection();
			spainregisterpage.YearBirthDaySelection();
			spainregisterpage.PhoneNoSelection();
			spainregisterpage.PrivacySelection();
			spainregisterpage.SubmitSelection();
			
			
			
			
			
			
			
			
			
			
		}
		
		
		@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}


}
