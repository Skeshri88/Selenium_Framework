package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


public class ContactPage extends TestBase
{
	
	@FindBy(xpath="//input[@class='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='country']")
	WebElement Country;
	
	@FindBy(xpath="//textarea[@id='subject']")
	WebElement Subject;
	
	@FindBy(xpath="//a[text()='Google Link']")
	WebElement GoogleLink;
	
	@FindBy(xpath="//a[text()='Google Link is here']")
	WebElement GoogleLinkishere;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	
	
	
	
	
	
	
	
	
	
	public ContactPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterFirstName() 
	{
		FirstName.sendKeys("Shailesh");		
	}
	
	
	
	
	public void  EnterLastName()
	{
		LastName.sendKeys("Keshri");
		
		
	}
	
	
	public void  EnterCountry()
	{
		Country.sendKeys("India");
	}
	
	public void  EnterSubject()
	{
		Subject.sendKeys("Shailesh Keshri Subject");
	}
	
	public void verifyGoogleLink()
	{
		GoogleLink.isDisplayed();
	}
	
	
	public void verifyGoogleLinkishere()
	{
		GoogleLinkishere.isDisplayed();
	}

	
	public void clickSubmitButton()
	{
		Submit.click();
	}
	



	
	
	
	
	
	

}
