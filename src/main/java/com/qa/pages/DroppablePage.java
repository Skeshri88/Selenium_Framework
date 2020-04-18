package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DroppablePage extends TestBase
{
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement DragMe;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement DropMe;
	
	@FindBy(xpath="//p[text()='Dropped!']")
	WebElement Dropped;
	
	
	
	
	
	
	public DroppablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void OperationDrag()
	{
		Actions actions= new Actions(driver);
		actions.dragAndDrop(DragMe, DropMe).perform();
		
   }
	
	public void VerificationDropedText()
	{
		String text1= "Dropped!";
		String text2= Dropped.getText();
		
		if(text1.equalsIgnoreCase(text2))
		{
			System.out.println("Text Verified");
		}
		
		else
		{
			System.out.println("Text not Verified");
		}
				
	}
	
	
	

}
