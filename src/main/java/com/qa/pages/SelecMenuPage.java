package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class SelecMenuPage extends TestBase
{
	@FindBy(xpath="//span[@id='speed-button']")
	WebElement selectaSpeed;
	
	@FindBy(xpath="//span[@id='speed-button']")
	List<WebElement> optionsselectaSpeed;
	
	//Selecting a File
	@FindBy(xpath="//span[@id='files-button']")
	WebElement selectaFile;
	
	@FindBy(xpath="//span[@id='files-button']")
	List<WebElement> optionsselectaFile;
	
	
	
	@FindBy(xpath="//span[@id='number-button']")
	WebElement selectaNumber;
	
	@FindBy(xpath="//span[@id='number-button']")
	List<WebElement> optionsselectaNumber;
	
	
	
	
	
	
	@FindBy(xpath="//span[@id='salutation-button']")
	WebElement selectaTitle;
	
	@FindBy(xpath="//span[@id='salutation-button']")
	List<WebElement> optionsselectaTitle;
	
	
	
	public SelecMenuPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	 public void SelectSpeed()
	 {
		 //selectaSpeed.click();
		 for(WebElement option : optionsselectaSpeed) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a Speed1")))
			    {
			        option.click();
			    }
		 
	  }
	 }
	 
	 
	 public void SelectFile()
	 {
		 selectaFile.click();
		 for(WebElement option : optionsselectaFile) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a File1"))) 
			    {
			        option.click();
			    }
		 
	  }
	 }
	 
		
	 
	 public void SelectNumber()
	 {
		 selectaNumber.click();
		 for(WebElement option : optionsselectaTitle) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a number1")))
			    {
			        option.click();
			    }
		 
	  }
		 
		 
		 
	 }
		 
	 
	 public void SelectTitle()
	 {
		 selectaTitle.click();
		 selectaNumber.click();
		 for(WebElement option : optionsselectaTitle) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a title1")))
			    {
			        option.click();
			    }
		 
	  }
		
		 
		 
	 }
	 
	 

}
