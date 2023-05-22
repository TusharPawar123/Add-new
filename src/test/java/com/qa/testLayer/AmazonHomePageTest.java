package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.testBase.TestBase;

public class AmazonHomePageTest extends TestBase  {

	@Test
	public void verifyAmazonHomePage()
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
	}
	}

