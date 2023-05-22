package com.qa.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pageLayer.AmazonHomePage;
import com.qa.pageLayer.AmazonPage;
import com.qa.pageLayer.Mobile_Page;
import com.qa.pageLayer.SignInPageEnterEmail;
import com.qa.pageLayer.SignInPageEnterPassword;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		String browser = "chrome";
		
	if (browser.equalsIgnoreCase("chrome"))	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
	
		else if (browser.equalsIgnoreCase("safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
	
	
		else {
			System.out.println("Enter Diff Browser Name");
		}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	AmazonPage check = new AmazonPage(); 
	check.clickOnHelloSignIn();
	Thread.sleep(5000);
	SignInPageEnterEmail signIn = new SignInPageEnterEmail(); 
	 	signIn.enterEmailAddress("8275156908"); 
	 	signIn.clickOnContinueButton(); 
	 	 
	 	SignInPageEnterPassword pass = new SignInPageEnterPassword(); 
	 	pass.enterSignInPassword("Pawar@123"); 
	 	pass.clickOnSignInButton(); 
	 	 
	 	//AmazonPage check = new AmazonPage();  
	 	//check.clickOnHelloSignIn(); 
	 	 
	 	AmazonHomePage mobilecheck = new AmazonHomePage();  
	 	mobilecheck.clickOnMobile(); 

	    Mobile_Page mob = new Mobile_Page(); 
	    mob.clickOnSmartphoneBasicMobiles(); 
	
	
	
	  
	
		}
		@AfterTest
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.quit();
		}
	
	
}
