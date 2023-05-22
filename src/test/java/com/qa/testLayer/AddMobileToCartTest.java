 package com.qa.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.AddMobileToCart;
import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.Mobile_Page;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;
import com.qa.pageLayer.SmartPhonesBasicsMobiles;
import com.qa.testBase.TestBase;

public class AddMobileToCartTest extends TestBase {

	@Test 
 	public void verifyAddToCartFunctionality() throws InterruptedException 
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
 	    
 	     
 	    JavascriptExecutor js = ((JavascriptExecutor)driver); 
 	      	js.executeScript("scroll(0,600)"); 
 	     
 	 	AddMobileToCart amc = new AddMobileToCart(); 
 	 	amc.clickOnAddToCart(); 
 	 	 
 	 	 
 	 	Thread.sleep(10000); 
 	 	String expected_result = "Added to Cart";  
 	 	String actual_result = amc.getStatusMessage(); 
 	 	Assert.assertEquals(actual_result,expected_result); 
 	 	System.out.println("Expected result: " +expected_result); 
 	 	System.out.println("Actual  result: " +actual_result); 
 	 	 
 	 	 
 	} 
 	 
 	 
 	 
} 
   
 
 


