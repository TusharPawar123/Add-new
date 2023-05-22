package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.Mobile_Page;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.testBase.TestBase;

public class Mobile_PageTest  extends TestBase{

	@Test  
 	public void verifyMobilePage() 
 	{ 
 	 	    SignInPageEnterEmail signIn = new SignInPageEnterEmail(); 
 	 	 	signIn.enterEmailAddress("8275156908"); 
 	 	 	signIn.clickOnContinueButton(); 
 	 	 	 
 	 	 	SignInPageEnterPassword pass = new SignInPageEnterPassword(); 
 	 	 	pass.enterSignInPassword("Pawar@123"); 
 	 	 	pass.clickOnSignInButton(); 
 	 	 	 
 	 	 	AmazonPage check = new AmazonPage();  
 	 	 	check.clickOnHelloSignIn(); 
 	 	 	 
 	 	 	AmazonHomePage mobilecheck = new AmazonHomePage();  
 	 	 	mobilecheck.clickOnMobile(); 
 	 
 	 	    Mobile_Page mob = new Mobile_Page(); 
 	 	    mob.clickOnSmartphoneBasicMobiles(); 
 	} 

}