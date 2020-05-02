package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBaseLanguage;

public class RegisterPage extends TestBaseLanguage
{
    //First url or Common 
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
	
	@FindBy(xpath="//Select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement DayYear;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement Register;
	
	
	//Second Url
	@FindBy(xpath="//h1[text()='Erstellen Sie Ihr Olaz Konto']")
	WebElement TextPage;
	
	@FindBy(xpath="//img[@id='phdesktopbody_0_imgfemale']")
	WebElement Female1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[firstname]']")
	WebElement FirstName1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[lastname]']")
	WebElement LastName1;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']")
	WebElement Country1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][line1]']")
	WebElement Address1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")
	WebElement Post1;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")
	WebElement City1;
	
	//Third Url
	@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_consumer[secondary_lastname]']")
	WebElement MiddleName;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_ctl74']")
	WebElement Privacy;
	
	
	
	
	public  RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Common 
	public void EnterEmail()
	{
		Email.sendKeys(prop.getProperty("Email"));
	}
	
	public void EnterPassword()
	{
		Password.sendKeys(prop.getProperty("Password"));
	}
	
	public void EnterConfirmPassword()
	{
		ConfirmPassword.sendKeys(prop.getProperty("ConfirmPassowrd"));
	}
	
	public void SelectDay()
	{
		DayBirthDay.click();
		Select select= new Select(DayBirthDay);
		select.selectByVisibleText(prop.getProperty("Day"));	
	}
	
	public void SelectMonth()
	{
		DayMonth.click();
		Select select= new Select(DayMonth);
		select.selectByVisibleText(prop.getProperty("Month"));	
	}
	
	public void SelectYear()
	{
		DayYear.click();
		Select select= new Select(DayYear);
		select.selectByVisibleText(prop.getProperty("Year"));	
	}
	
	public OlayHomePage ClickRegister()
	{
		Register.click();
		 return new OlayHomePage();
	}
	
	
	
	
	
	public void logincheck() throws InterruptedException
	{
		
		String urlName = prop.getProperty("urllanguage");
		if(urlName.equals("https://www.olaz.de/de-de"))
		{
			Female1.click();
			FirstName1.sendKeys(prop.getProperty("FirstName"));
			LastName1.sendKeys(prop.getProperty("LastName"));
			Thread.sleep(5000);
			Country1.click();
			Thread.sleep(2000);
			Select select4= new Select(Country1);
			select4.selectByVisibleText(prop.getProperty("Country"));
			Thread.sleep(5000);
			Address1.sendKeys(prop.getProperty("Address"));
			Post1.sendKeys(prop.getProperty("Post"));
			City1.sendKeys(prop.getProperty("City"));
			
			
		}
		
		else  if(urlName.equals("https://www.olay.es/es-es"))
		{
			Female1.click();
			FirstName1.sendKeys(prop.getProperty("FirstName"));
			LastName1.sendKeys(prop.getProperty("LastName"));
			MiddleName.sendKeys(prop.getProperty("MiddleName"));
			PhoneNumber.sendKeys(prop.getProperty("PhoneNumber"));
			Privacy.click();
		}
		
		
	}
	
	
	
	
}
