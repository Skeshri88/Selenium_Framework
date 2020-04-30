package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactHomePage extends TestBase
{
	
	@FindBy(xpath="//input[@class='search-submit']")
	WebElement Search;
	
	
	
	public ContactHomePage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver, this);
	}
	
	
	public void SearchButton() 
	{
		Search.isDisplayed();		
	}
	

}
