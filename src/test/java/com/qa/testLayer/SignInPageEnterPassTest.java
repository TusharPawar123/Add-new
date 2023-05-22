package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.testBase.TestBase;

public class SignInPageEnterPassTest extends TestBase  {

	@Test
	public void verifyEnterPasswordFunctionality()
	{
	AmazonPage check = new AmazonPage();
	check.clickOnHelloSignIn();
	
	SignInPageEnterEmail signIn = new SignInPageEnterEmail();
	signIn.enterEmailAddress("8275156908");
	
	signIn.clickOnContinueButton();
	
	SignInPageEnterPassword pass = new SignInPageEnterPassword();
	pass.enterSignInPassword("Pawar@123");
	
	pass.clickOnSignInButton();
	}
}
