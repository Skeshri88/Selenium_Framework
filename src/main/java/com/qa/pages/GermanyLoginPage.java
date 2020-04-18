package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseGemrany;

public class GermanyLoginPage extends TestBaseGemrany

{
	
	@FindBy(xpath="//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")
	WebElement Register;
	
	
	
	public GermanyLoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public GermanyRegisterPage  RegisterClick()
	{
		Register.click();
		return new GermanyRegisterPage();
	}



}
