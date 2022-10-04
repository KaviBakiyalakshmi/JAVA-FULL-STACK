package com.simplilearn.testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
  
  @Test
  public void facebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kavi@123");
		driver.findElement(By.name("login")).submit();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }
  @AfterMethod
  public void afterMethod() {
	 // driver.close();
	  driver=null;
	  
  }
  
}
