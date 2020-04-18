package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DatePickerPage extends TestBase
{
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement DatePickerPoup;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement DatePickerNextButton;
	
	@FindBy(xpath="//a[text()='14']")
	WebElement DateSelection;
	
	
	public DatePickerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void  Selectdate()
	{
		DatePickerPoup.click();
		DatePickerNextButton.click();
		DateSelection.click();
		
	}

}
