package com.simplilearn.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Phase 5\\session-1\\session-2-selenium\\src\\com\\simplilearn\\demo\\iframe.html");
		
		
		//find iframe from the website
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				List<WebElement> frame= driver.findElements(By.tagName("iframe"));
				System.out.println("Total Number of iFrame Found: "+frame.size());
		
		
	}

}
