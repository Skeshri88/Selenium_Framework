package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBaseUK;

public class UKRegisterPage extends TestBaseUK
{
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][password]']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][confirm]']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")
	WebElement DayBirthDay;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")
	WebElement DayMonth;
	
	@FindBy(xpath="//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")
	WebElement DayYear;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement Register;
	
	
	
	public UKRegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void EnterEmail()
	{
		Email.sendKeys("Shailesh.keshri@wipro.com");
	}
	
	public void EnterPassword()
	{
		Password.sendKeys("Shailesh.keshri@wipro.com");
	}
	
	public void EnterConfirmPassword()
	{
		ConfirmPassword.sendKeys("Shailesh.keshri@wipro.com");
	}
	
	public void SelectDay()
	{
		DayBirthDay.click();
		Select select= new Select(DayBirthDay);
		select.selectByVisibleText("11");	
	}
	
	public void SelectMonth()
	{
		DayMonth.click();
		Select select= new Select(DayMonth);
		select.selectByVisibleText("8");	
	}
	
	public void SelectYear()
	{
		DayYear.click();
		Select select= new Select(DayYear);
		select.selectByVisibleText("1990");	
	}
	
	public void ClickRegister()
	{
		Register.click();
	}
	
	
	
	
	
	
	

}
