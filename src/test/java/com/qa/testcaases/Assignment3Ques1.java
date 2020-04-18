package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBaseAssignment3;
import com.qa.pages.HomePage;
import com.qa.pages.MFlightDetailsPage;
import com.qa.pages.MFlightReviewPage;
import com.qa.pages.MLoginPage;

public class Assignment3Ques1 extends TestBaseAssignment3
{
	
	public Assignment3Ques1()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	
	@Test(priority=1)
	public void MMTTicketBooking() throws InterruptedException
	{
		MLoginPage mloginpage= new MLoginPage();
		mloginpage.EnterFromField();
		mloginpage.EnterToField();
		mloginpage.DepartureDate();
		mloginpage.clicksearch();
		
		
		MFlightDetailsPage mflightdetailspage = new MFlightDetailsPage();
		mflightdetailspage.FlightDetails();
		
		MFlightReviewPage mflightreviewpage=new MFlightReviewPage();
		mflightreviewpage.verifyReviewYourBooking();
		
		
		
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	}
	    


