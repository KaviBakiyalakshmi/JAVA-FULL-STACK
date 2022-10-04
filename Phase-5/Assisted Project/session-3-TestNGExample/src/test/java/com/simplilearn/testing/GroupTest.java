package com.simplilearn.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupTest {
	
	WebDriver driver=null;
	
  @Test(groups="Chrome")
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }


@Test(groups="Chrome",dependsOnMethods= {"launchChrome"})
public void loginWithChrome() {

	driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Kavi@123");
	driver.findElement(By.name("login")).submit();

}

@Test(groups="Firefox")
public void launchFireFox() {
	System.setProperty("webdriver.gecko.driver", "D:\\Phase 5\\SeleniumJarFiles\\gecko-Driver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
@Test(groups="Firefox",dependsOnMethods = {"launchFireFox"})
public void loginWithFireFox() {
	driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Kavi@123");
	driver.findElement(By.name("login")).submit();

	
}
}
