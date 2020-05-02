package com.qa.testcaases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBaseLanguage;
import com.qa.pages.HomePage;
import com.qa.pages.OlayHomePage;
import com.qa.pages.RegisterPage;
import com.qa.pages.SelectablePage;
import com.qa.pages.WelcomePage;

public class RegisterTest extends TestBaseLanguage
{
	
	public RegisterTest()
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
	public void testregister() throws InterruptedException
	{
	    WelcomePage welcomepage= new WelcomePage();
	    welcomepage.RegisterClick();
	    
	    RegisterPage  registerpage= new RegisterPage();
	    registerpage.EnterEmail();
	    registerpage.EnterPassword();
	    registerpage.EnterConfirmPassword();
	    registerpage.SelectDay();
	    registerpage.SelectMonth();
	    registerpage.SelectYear();   
	    registerpage.logincheck();
	    registerpage.ClickRegister();
	    
	    OlayHomePage olayhomepage= new OlayHomePage();
	    Thread.sleep(5000);
	    olayhomepage.verifySubscriptiontext();
	    

	    
	    
		
		
			
		
	}
	

	
	@AfterMethod()
		public void actionaftrtest()
		{
			driver.close();
		}
	
	


}
