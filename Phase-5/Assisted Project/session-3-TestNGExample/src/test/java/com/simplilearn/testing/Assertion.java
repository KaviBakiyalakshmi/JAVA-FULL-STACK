package com.simplilearn.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	WebDriver driver=null;
	SoftAssert soft=null;
  @Test
  public void TitleTest() {
	  
	  //testcase
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  
	  soft.assertEquals(driver.getTitle(), "Google");
	  soft.assertAll();
	  
	 // driver.close();
  }
  
   //another test
	@Test
	  public void TitleTestFacebook() {
		  
		  //testcase
		  driver.get("https://www.facebook.com/");
		  System.out.println(driver.getTitle());
		  
		  soft.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		  soft.assertAll();
		  
		 
	  }
	  
  
  @BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
		driver= new ChromeDriver();
		soft= new SoftAssert();
	}
	@AfterMethod
	public void afterMethod() {
		
		driver=null;
	}
}
	
	  