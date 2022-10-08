package com.simplilearn.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Phase 5\\SeleniumJarFiles\\chrome-Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("D:\\Phase 5\\session-2-selenium\\screenshot\\Facebook.png"));
			FileHandler.copy(src, new File("D:\\Phase 5\\session-2-selenium\\screenshot\\google.png"));
			System.out.println("ScreenShot Saved Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		
	}

}