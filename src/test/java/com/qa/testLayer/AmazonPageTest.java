package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.testBase.TestBase;

public class AmazonPageTest  extends TestBase{
	 
	@Test 
	public void verifyAmazonPage() 
	{ 
	 	 
	 	 
	 	SignInPageEnterEmail signIn = new SignInPageEnterEmail(); 

signIn.enterEmailAddress("8275156908"); 
	 signIn.clickOnContinueButton(); 
	 	 
	 	SignInPageEnterPassword pass = new 
SignInPageEnterPassword(); 
	 	pass.enterSignInPassword("Pawar@123");  	 	
	 	pass.clickOnSignInButton(); 
	 	 
	 	AmazonPage check = new AmazonPage();   	 	
	 	check.clickOnHelloSignIn(); 
	} 
} 




