package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ControlGroup;
import com.qa.pages.HomePage;
import com.qa.pages.SelecMenuPage;

public class Assignment1Ques6 extends TestBase
{
	
	public Assignment1Ques6()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	
	@Test(priority=1)
	
	public void Clickl() throws InterruptedException
	{
	    HomePage t= new HomePage();
	    t.clickControlGroup();
	    
	    ControlGroup controlgroup= new ControlGroup();
	    controlgroup.selectcarsize();
	    controlgroup.radiobuttonselectinStandard();
	    controlgroup.checkboxselectioninsurance();
	    controlgroup.enterNoofcars();
	    controlgroup.clickBooknow();
	    
			
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	


}
