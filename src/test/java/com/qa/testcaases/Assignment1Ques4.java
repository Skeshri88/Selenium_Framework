package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.DroppablePage;
import com.qa.pages.HomePage;

public class Assignment1Ques4 extends TestBase
{
	public Assignment1Ques4()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	
	@Test(priority=1)
	//Click on selectable link
	public void Clickl() throws InterruptedException
	{
	    HomePage t= new HomePage();
		t.clickDatePicker();
		
		DatePickerPage datepickerpage = new DatePickerPage ();
		datepickerpage.Selectdate();
				
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	



}
