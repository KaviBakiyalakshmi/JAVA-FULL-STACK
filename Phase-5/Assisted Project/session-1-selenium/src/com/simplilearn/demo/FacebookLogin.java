package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1 declare a path
		String path="D:\\Phase 5\\SeleniumJarFiles\\chrome-Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//step 2 iNITIALIZE THE WEBDRIVER
		WebDriver driver=new ChromeDriver();
		
		//step:3 Give base url
		String url="https://www.facebook.com/";
		driver.get(url);
		
		//maximise the window
		driver.manage().window().maximize();
		
		//get title of page
		System.out.println("Title:"+driver.getTitle());
		
		
		WebElement email=driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("kavi@gmail.com");
		
		WebElement pass=driver.findElement(By.name("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		pass.sendKeys("Kavi@123");
		
		WebElement login=driver.findElement(By.name("login"));
		login.submit();
		
		
		
	}

}
