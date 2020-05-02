package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.HomePage;
import com.qa.pages.SelecMenuPage;

public class Assignment1Ques5 extends TestBase
{
	public Assignment1Ques5()
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
		t.selectmenu();
		
		SelecMenuPage selecmenupage= new SelecMenuPage();
		selecmenupage.SelectSpeed();
		Thread.sleep(5000);
		selecmenupage.SelectFile();
		selecmenupage.SelectNumber();
		selecmenupage.SelectTitle();
		
		
		
		
		
		
	
			
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	


}
