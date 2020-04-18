package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DroppablePage;
import com.qa.pages.HomePage;
import com.qa.pages.SelectablePage;

public class Assignment1Ques3 extends TestBase
{
	public Assignment1Ques3()
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
	public void Clickl()
	{
	    HomePage t= new HomePage();
		t.clickonDroppable();
		
		DroppablePage droppablepage= new DroppablePage();
		droppablepage.OperationDrag();
		droppablepage.VerificationDropedText();
		
		
		
	
			
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	


}
