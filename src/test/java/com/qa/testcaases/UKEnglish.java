package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBaseUK;
import com.qa.pages.MFlightDetailsPage;
import com.qa.pages.MFlightReviewPage;
import com.qa.pages.MLoginPage;
import com.qa.pages.UKLoginPage;
import com.qa.pages.UKRegisterPage;

public class UKEnglish extends TestBaseUK
{
	
	public UKEnglish()
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
		UKLoginPage ukloginpage= new UKLoginPage();
		ukloginpage.RegisterClick();
		
		UKRegisterPage  ukregisterpage= new UKRegisterPage();
		ukregisterpage.EnterEmail();
		ukregisterpage.EnterPassword();
		ukregisterpage.EnterConfirmPassword();
		ukregisterpage.SelectDay();
		ukregisterpage.SelectMonth();
		ukregisterpage.SelectYear();
		ukregisterpage.ClickRegister();
		
		
		
		
		
		
		
		
	}
	
	
	//@AfterMethod()
	//public void actionaftrtest()
	//{
		//driver.close();
	//}

}
