package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SelectablePage;

public class Assignment1Ques1 extends TestBase
{
	
	public Assignment1Ques1()
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
		t.clickonselectablelink();
		
		SelectablePage ItemClickA= new SelectablePage();
		ItemClickA.ClickAllItemList();
		Thread.sleep(5000);
			
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	

}
