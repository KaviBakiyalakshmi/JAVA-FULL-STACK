package com.simplilearn.demo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1: Declare a path
		String path="D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Initialize the web driver
		WebDriver driver=new ChromeDriver();
		
		//step 3:Give the base url
		String url="http://www.google.com";
		driver.get(url);
		
		System.out.println("Title:"+driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//assertEquals("Google",driver.getTitle());
		
		driver.close();
		
	}

}
