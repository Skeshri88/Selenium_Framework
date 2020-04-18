package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBaseGemrany;

public class GermanyRegisterPage extends TestBaseGemrany
{
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	WebElement Cookies;
	
	
	@FindBy(xpath="//img[@id='phdesktopbody_0_imgfemale']")
	WebElement Female;
	
	@FindBy(xpath="phdesktopbody_0_grs_consumer[firstname]")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[lastname]']")
	WebElement LastName;
	
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][password]']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][confirm]']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")
	WebElement DayBirthDay;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")
	WebElement MonthBirthDay;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement YearBirthDay;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']")
	WebElement Country;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][line1]']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")
	WebElement Post;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")
	WebElement City;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	

	
	public void GermanyLoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void acceptCookies()
	{
		Cookies.click();
	}
	
	
	
	public void FemaleClick()
	{
		Female.click();
	}
	
	
	public void FirstNameEnter()
	{
		FirstName.sendKeys("Shailesh");
	}
	
	
	public void LastNameEnter()
	{
		LastName.sendKeys("Shailesh");
	}
	
	public void EmailEnter()
	{
		Email.sendKeys("shailesh.keshri@wipro.com");
	}
	
	
	public void PasswordEnter()
	{
		Password.sendKeys("Shailesh@234");
	}
	
	public void ConfirmPasswordEnter()
	{
		ConfirmPassword.sendKeys("Shailesh@234");
	}
	
	
	public void DayBirthdayEnter()
	{
		Select select1= new Select(DayBirthDay);
		select1.selectByVisibleText("11");
	}
	
	
	public void MonthBirthdayEnter()
	{
		Select select2= new Select(MonthBirthDay);
		select2.selectByVisibleText("8");
	}
	
	
	public void YearBirthdayEnter()
	{
		Select select3= new Select(YearBirthDay);
		select3.selectByVisibleText("1990");
	}
	
	public void CountrySelection()
	{
		Select select3= new Select(Country);
		select3.selectByVisibleText("Deutschland");
	}

	public void AddressEnter()
	{
		Address.sendKeys("1234");
	}
	
	
	public void PostEnter()
	{
		Post.sendKeys("10115");
	}
	
	public void CityEnter()
	{
		City.sendKeys("1234");
	}
	
	public void SubmitClick()
	{
		Submit.click();
	}
	
	
	
}
