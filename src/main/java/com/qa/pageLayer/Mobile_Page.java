package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Mobile_Page extends TestBase {

	public Mobile_Page () 
 	{ 
 	 	PageFactory.initElements(driver, this); 
 	} 
 	 
 	@FindBy(xpath="//a[text()='Mobiles']") 
 	private WebElement mobile;  
 	 
 @FindBy(xpath="//span[text()='Smartphones & Basic Mobiles']")
 private WebElement Smartphones;  
 	 
 	public void clickOnMobile() 
 	{ 
 	 	mobile.click(); 
 	} 
 	 
 	public void clickOnSmartphoneBasicMobiles () 
 	{ 
 	 	Smartphones.click(); 
 	} 
 	 

}
