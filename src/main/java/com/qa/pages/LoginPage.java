package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.base.TestBaseLanguage;
import com.qa.util.TestUtil;

public class LoginPage extends TestBaseLanguage
{
	@FindBy(xpath="//input[@id='phdesktopbody_0_username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='phdesktopbody_0$SIGN IN']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//span[@id='phdesktopbody_0_Message']")
	WebElement LoginFailed;
	
	
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void LoginTest(String UserName, String PassWord)
	{
		String text="The email and password combination you entered is incorrect."
				     + " Please try again, or click the link below to create an account.";
		Username.sendKeys(UserName);
		Password.sendKeys(PassWord);
		LoginBtn.click();
		String text1 = LoginFailed.getText();
		if(text.equalsIgnoreCase(text1))
		{
			System.out.println("Login failed and trying again");
		}
		
		else 
		{
			
			System.out.println("Login Failed");
		}
		Username.clear();
		Password.clear();
		
		
		
		
		
		
	}

}
