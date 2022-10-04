package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//download selenium google chrome driver from 
				//Link: https://chromedriver.chromium.org/downloads
				// check your google chrome version from chrome>help>aboout google chrome driver> check your version and downbload the driver
		
		
		//download selenium standalone server .jar and selenium-standalone-server-3.5.0.jar AND Selenium-java-3.5.0.jar file from 
				//link: https://www.selenium.dev/downloads/  
				// and extract it 
		
		//STEP:1 declare a path
		String path= "D:\\Phase 5\\SeleniumJarFiles\\chrome-Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		//STEP:2 Initialize the web driver
		WebDriver driver=new ChromeDriver();
		
		//Step 3:Give the base URL
		String url="http://www.google.com";
		driver.get(url);
		driver.close();
		System.out.println("Driver Working Properly");
		
	}

}
