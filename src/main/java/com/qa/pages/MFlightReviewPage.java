package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseAssignment3;

public class MFlightReviewPage extends TestBaseAssignment3
{
	@FindBy(xpath="//h4[text()='Review your booking']")
	WebElement ReviewYourBooking;
	
	
	
	
	
	public MFlightReviewPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	
	public void  verifyReviewYourBooking()
	{
		ReviewYourBooking.isDisplayed();
		
	}

}
