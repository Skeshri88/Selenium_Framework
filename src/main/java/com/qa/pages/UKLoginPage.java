package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseUK;

public class UKLoginPage extends TestBaseUK
{
	@FindBy(xpath="//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")
	WebElement Register;
	
	
	
	public UKLoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public UKRegisterPage  RegisterClick()
	{
		Register.click();
		return new UKRegisterPage();
	}


}
