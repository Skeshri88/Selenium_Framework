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
	
	public void logincheck() throws InterruptedException
	{
		
		String urlName = prop.getProperty("urllanguage");
		if(urlName.equals("https://www.olaz.de/de-de"))
		{
			Female1.click();
			FirstName1.sendKeys("Shailesh");
			LastName1.sendKeys("Keshri");
			Thread.sleep(5000);
			Country1.click();
			Thread.sleep(2000);
			Select select4= new Select(Country1);
			select4.selectByVisibleText("Deutschland");
			Thread.sleep(5000);
			Address1.sendKeys("Asdss");
			Post1.sendKeys("10115");
			City1.sendKeys("1234");
			
			
		}
		
		else if(urlName.equals("https://www.olay.es/es-es"))
		{
			Female1.click();
			FirstName1.sendKeys("Shailesh1");
			LastName1.sendKeys("Keshri1");
			MiddleName.sendKeys("Kumar");
			PhoneNumber.sendKeys("+34912345678");
			Privacy.click();
		}
		
		else
		{
			Register.click();
		}
	}
	
	
	
}
