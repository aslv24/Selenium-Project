package com.selenium.webLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSet1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("admin@mail.com");
		emailField.clear();
		emailField.sendKeys("email@mail.com");
		
		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.sendKeys("Email@123");
	}

}
