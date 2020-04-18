package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseSpain;

public class SpainLoginPage extends TestBaseSpain
{
	@FindBy(xpath="//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")
	WebElement Register;
	
	
	
	public SpainLoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public SpainRegisterPage  RegisterClick()
	{
		Register.click();
		return new SpainRegisterPage();
	}


}
