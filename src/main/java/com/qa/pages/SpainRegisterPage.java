package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBaseSpain;

public class SpainRegisterPage  extends TestBaseSpain
{
	@FindBy(xpath="//img[@id='phdesktopbody_0_imgfemale']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[firstname]']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_consumer[secondary_lastname]']")
	WebElement MiddleName;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[lastname]']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][password]']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][confirm]']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//Select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")
	WebElement DayBirthDay;
	
	@FindBy(xpath="//Select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")
	WebElement MonthBirthDay;
	
	@FindBy(xpath="//Select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement YearBirthDay;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]']")
	WebElement PhoneNumber;
	
	
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_ctl74']")
	WebElement Privacy;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_submit']")
	WebElement Submit;
	
	
	
	
	
	
	
	public SpainRegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void GenderSelection()
	{
		Gender.click();
	}
	
	public void FirstNameEnter()
	{
		FirstName.sendKeys("Shailesh");
	}
	
	public void middleNameEnter()
	{
      MiddleName.sendKeys("Kumar");
	}
	
	public void LastNameEnter()
	{
      LastName.sendKeys("Keshri");
	}
	
	
	public void EmailEnter()
	{
      Email.sendKeys("shailesh.Keshri@wipro.com");
	}
	
	public void PasswordEnter()
	{
      Password.sendKeys("Shailesh@345");
	}
	
	public void ConfirmPasswordEnter()
	{
      ConfirmPassword.sendKeys("Shailesh@345");
	}
	
	public void DayBirthDaySelection()
	{
		DayBirthDay.click();
		Select select1 = new Select(DayBirthDay);
		select1.selectByVisibleText("11");
		
	}
	
	public void MonthBirthDaySelection()
	{
		MonthBirthDay.click();
		Select select2 = new Select(MonthBirthDay);
		select2.selectByVisibleText("8");
	}
	
	
	public void YearBirthDaySelection()
	{
		YearBirthDay.click();
		Select select3 = new Select(YearBirthDay);
		select3.selectByVisibleText("1990");
	}
	
	
	public void PhoneNoSelection()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		PhoneNumber.sendKeys("+34912345678");
	}
	
	public void PrivacySelection()
	{
		Privacy.click();
	}
	
	public void SubmitSelection()
	{
		Submit.click();
	}
	
	
	
	
	
	
	
	

}
