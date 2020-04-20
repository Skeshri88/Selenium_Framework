package com.qa.pages;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBaseGemrany;

public class GermanyRegisterPages extends TestBaseGemrany
{
	
	@FindBy(xpath="//img[@id='phdesktopbody_0_imgfemale']")
	WebElement Female1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[firstname]']")
	WebElement FirstName1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[lastname]']")
	WebElement LastName1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")
	WebElement Email1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][password]']")
	WebElement Password1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][confirm]']")
	WebElement ConfirmPassword1;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")
	WebElement DayBirthDay1;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")
	WebElement MonthBirthDay1;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement YearBirthDay1;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	WebElement AcceptCookies1;
	
	
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']")
	WebElement Country1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][line1]']")
	WebElement Address1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")
	WebElement Post1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")
	WebElement City1;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit1;
	
	
	
	
	
	
	public GermanyRegisterPages()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void FemaleClick()
	{
		Female1.click();
	}
	
	public void FirstNameEnter()
	{
		FirstName1.sendKeys("Shailesh");
	}
	
	public void LastNameEnter()
	{
		LastName1.sendKeys("Shailesh");
	}
	
	public void EmailEnter()
	{
		Email1.sendKeys("shailesh.keshri@wipro.com");
	}
	
	
	
	
	public void PasswordEnter()
	{
		Password1.sendKeys("Shailesh@234");
		
	}
	
	public void ConfirmPasswordEnter()
	{
		ConfirmPassword1.sendKeys("Shailesh@234");
	}
	
	public void DayBirthdayEnter()
	{
		Select select1= new Select(DayBirthDay1);
		select1.selectByVisibleText("11");
	}
	
	
	public void MonthBirthdayEnter()
	{
		Select select2= new Select(MonthBirthDay1);
		select2.selectByVisibleText("8");
	}
	
	
	public void YearBirthdayEnter()
	{
		Select select3= new Select(YearBirthDay1);
		select3.selectByVisibleText("1990");
	}
	
	public void CountrySelection() throws InterruptedException
	{
		Thread.sleep(5000);
		Country1.click();
		Thread.sleep(2000);
		Select select4= new Select(Country1);
		select4.selectByVisibleText("Deutschland");
		Thread.sleep(5000);
	}

	public void AddressEnter()
	{
		Address1.sendKeys("1234");
	}
	
	public void AcceptCookiesClick()
	{
		AcceptCookies1.click();
	}
	
	public void PostEnter()
	{
		Post1.sendKeys("10115");
	}
	
	public void CityEnter()
	{
		City1.sendKeys("1234");
	}
	
	public void SubmitClick()
	{
		Submit1.click();
	}
	
	
	

}
