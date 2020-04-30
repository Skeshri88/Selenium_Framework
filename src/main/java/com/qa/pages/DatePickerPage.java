package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DatePickerPage extends TestBase
{
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement DatePickerPoup;
	
	
		
	public DatePickerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void  Selectdate() throws InterruptedException
	{
		DatePickerPoup.sendKeys(prop.getProperty("DatePickerDate"));
		Thread.sleep(5000);
		DatePickerPoup.click();
		//DatePickerNextButton.click();
		//DateSelection.click();	
	}
	
	public void verificationDate()
	{
		String text="04/30/2020";
		String text1=DatePickerPoup.getText();
		if(text.equalsIgnoreCase(text1))
		{
			System.out.print("Text verified");
		}
		else
		{
			System.out.println("Text is not verified");
		}
		
		
		
	}

}
