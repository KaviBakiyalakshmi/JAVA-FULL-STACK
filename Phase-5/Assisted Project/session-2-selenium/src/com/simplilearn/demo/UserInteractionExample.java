package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteractionExample {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		
		Actions builder= new Actions(driver);
		Action seriesOfAction=builder
				.moveToElement(username)
				.click()
				.keyDown(username,Keys.SHIFT)
				.sendKeys(username,"hello")
				.doubleClick(username)
				.contextClick()
				.build();
		
		seriesOfAction.perform();
	}

}
