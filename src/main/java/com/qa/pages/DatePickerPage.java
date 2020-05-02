package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DatePickerPage extends TestBase
{
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement DatePickerPoup;
	
	//@FindBy(xpath="//div[@id='ui-datepicker-div']")
	//WebElement ClosePopup;
	
	
	
	
		
	public DatePickerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void  Selectdate() throws InterruptedException
	{
		DatePickerPoup.sendKeys(prop.getProperty("DatePickerDate"));
		Thread.sleep(5000);	
	}
	
	public void verificationDate()
	{
		String text="05/30/2020";
		String text1=DatePickerPoup.getAttribute("type");
		System.out.println(text1);
		if( text==text1)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		
		
	}

}
