package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseLanguage;

public class WelcomePage  extends TestBaseLanguage
{
	@FindBy(xpath="//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")
	WebElement Register;
	
	
	
	public  WelcomePage ()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public RegisterPage  RegisterClick()
	{
		Register.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new RegisterPage();
	}


}
