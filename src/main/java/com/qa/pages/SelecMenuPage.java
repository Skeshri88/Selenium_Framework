package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class SelecMenuPage extends TestBase
{
	@FindBy(xpath="//span[@id='speed-button']")
	WebElement selectaSpeed;
	
	@FindBy(xpath="//div[@id='ui-id-4']")
	WebElement speeddropdown;
	
	
	
	
	@FindBy(xpath="//span[@id='files-button']")
	WebElement selectaFile;
	
	@FindBy(xpath="//div[@id='ui-id-8']")
	WebElement FileDropDown;
	
	
	
	@FindBy(xpath="//span[@id='number-button']")
	WebElement selectaNumber;
	
	@FindBy(xpath="//div[@id='ui-id-12']")
	WebElement NumberDropdown;
	
	
	
	
	@FindBy(xpath="//span[@id='salutation-button']")
	WebElement selectaTitle;
	
	@FindBy(xpath="//div[@id='ui-id-30']")
	WebElement TitleDropDown;
	
	public SelecMenuPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	 public void SelectSpeed()
	 {
		 selectaSpeed.click();
		 speeddropdown.click();
		 
	  }
	 
	 public void SelectFile()
	 {
		 selectaFile.click();
		 FileDropDown.click();
	 }
	 
	 public void SelectNumber()
	 {
		 selectaNumber.click();
		 NumberDropdown.click();
		 
		 
	 }
		 
	 
	 public void SelectTitle()
	 {
		 selectaTitle.click();
		 TitleDropDown.click();
		 
		 
	 }
	 
	 

}
