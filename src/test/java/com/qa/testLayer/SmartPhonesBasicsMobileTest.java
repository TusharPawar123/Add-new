package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.Mobile_Page;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.pageLayer.SmartPhonesBasicsMobiles;
import com.qa.testBase.TestBase;

public class SmartPhonesBasicsMobileTest extends TestBase {
	@Test  
 	public void verifySmartPhonesBasicsMobiles() 
 	 { 
 	 	 
 	 	AmazonPage check = new AmazonPage(); 
 	 	check.clickOnHelloSignIn(); 
 	 	 
 	 	SignInPageEnterEmail signIn = new SignInPageEnterEmail(); 
 	 	signIn.enterEmailAddress("8275156908"); 
 	 	signIn.clickOnContinueButton(); 
 	 	 
 	 	SignInPageEnterPassword pass = new SignInPageEnterPassword(); 
 	 	pass.enterSignInPassword("Pawar@123");
 	 	pass.clickOnSignInButton(); 
 	 	 
 	    AmazonHomePage mobilecheck = new AmazonHomePage();  
 	 	mobilecheck.clickOnMobile(); 
 	 
 	 	Mobile_Page mob = new Mobile_Page(); 
 	 	mob.clickOnSmartphoneBasicMobiles(); 
 	 	 
 	 	 
 	 	    SmartPhonesBasicsMobiles spbm = new SmartPhonesBasicsMobiles();  
 	 	    spbm.clickOnRedmiA1(); 
 	 	  
 	 }} 

  
