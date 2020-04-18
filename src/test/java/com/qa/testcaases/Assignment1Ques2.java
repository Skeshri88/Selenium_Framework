package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.SelectablePage;

public class Assignment1Ques2 extends TestBase
{
	
	public Assignment1Ques2()
	{
		//super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	
	@Test(priority=1)
	//Click on selectable link
	public void contactpagedetails() 
	{
	    HomePage homepage= new HomePage();
		homepage.clickonContact();
		
		ContactPage contactpage= new ContactPage();
		contactpage.EnterFirstName();
		contactpage.EnterLastName();
		contactpage.EnterCountry();
		contactpage.EnterSubject();
		contactpage.verifyGoogleLink();
		contactpage.verifyGoogleLinkishere();
		contactpage.clickSubmitButton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	


}
