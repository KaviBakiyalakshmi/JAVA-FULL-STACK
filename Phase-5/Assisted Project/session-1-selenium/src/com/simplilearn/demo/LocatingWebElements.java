package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		//Locating Web Elements
		
		//by id
		WebElement email_id=driver.findElement(By.id("email"));
		//by name
		WebElement email_names=driver.findElement(By.name("email"));
		System.out.println("Email By ID and Name:"+email_id.equals(email_names));
		
		//find link test
		
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		//by relative path(Xpath)
		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println("Email by xpath and Id:"+email_id.equals(email_xpath));
		
		//by full xpath
		WebElement email_full_xpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		System.out.println("Email by xpath and full xpath:"+email_full_xpath.equals(email_xpath));
		
		//by using selector (css selector)
		WebElement email_cssSelector=driver.findElement(By.cssSelector("#email"));
		System.out.println("Email By CSS selector and xpath is"+email_cssSelector.equals(email_xpath));
		
		//List of web elements
		List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list)
		{
			System.out.println("List of WebElements :"+e.getAttribute("placeholder"));
			
		}
		
		//by tag
		WebElement password=driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Password using Tag:"+password.getAttribute("placeholder"));
		
		driver.close();
		
		
		
	}

}
