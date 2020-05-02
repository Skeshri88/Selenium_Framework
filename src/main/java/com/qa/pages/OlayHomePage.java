package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class OlayHomePage extends TestBase
{
	@FindBy(xpath="//h1[text()='SUBSCRIPTIONS']")
	WebElement Subscriptions;
	
	
	
	public  OlayHomePage ()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void verifySubscriptiontext()
	{
		if(Subscriptions.isDisplayed())
		{
			System.out.println("Test Pass");
		}
		
		else
		{
			System.out.println("Test Fail");
		}


	}

}
