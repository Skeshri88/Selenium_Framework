package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SelectablePage extends TestBase
{
	//Item1 Xpath
	@FindBy(xpath="//ol[@id='selectable']//li[1]")
	WebElement Item1Click;
	
	@FindBy(xpath="//ol[@id='selectable']//li[2]")
	WebElement Item2Click;
	
	@FindBy(xpath="//ol[@id='selectable']//li[3]")
	WebElement Item3Click;
	
	@FindBy(xpath="//ol[@id='selectable']//li[4]")
	WebElement Item4Click;
	
	@FindBy(xpath="//ol[@id='selectable']//li[5]")
	WebElement Item5Click;
	
	@FindBy(xpath="//ol[@id='selectable']//li[6]")
	WebElement Item6Click;
	
	@FindBy(xpath="//ol[@id='selectable']//li[7]")
	WebElement Item7Click;
	
	
	
	public SelectablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void  Item1()
	{
		Item1Click.click();
		 String text1 =Item1Click.getText();
		 System.out.println("Item 1 text is "+text1 );
	}


	public void Item2() 
	{
		Item2Click.click();
		String text2 =Item2Click.getText();
		 System.out.println("Item 2 text is "+text2 );		
	}
	
	public void Item3() 
	{
		Item3Click.click();
		String text3 =Item3Click.getText();
		System.out.println("Item 3 text is "+text3 );		
	}
	
	public void Item4() 
	{
		Item4Click.click();
		String text4 =Item4Click.getText();
		 System.out.println("Item 4 text is "+text4 );		
	}
	
	public void Item5() 
	{
		Item5Click.click();
		String text5 =Item5Click.getText();
		 System.out.println("Item 5 text is "+text5 );		
	}
	
	public void Item6() 
	{
		Item6Click.click();
		String text6 =Item6Click.getText();
		 System.out.println("Item 6 text is "+text6 );		
	}
	
	public void Item7() 
	{
		Item7Click.click();
		String text7 =Item7Click.getText();
		 System.out.println("Item 7 text is "+text7);		
	}
	
	


}
