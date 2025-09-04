package com.selenium.webLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement emailField = driver.findElement(By.id("email"));
		
		System.out.println(emailField.isDisplayed());//true
		System.out.println(emailField.isEnabled());//true
		System.out.println(emailField.isSelected());//false
		
		System.out.println(emailField.getTagName());
		System.out.println(emailField.getAttribute("class"));
		System.out.println(emailField.getAttribute("placeholder"));
		
		emailField.click();
		emailField.clear();
		emailField.sendKeys("email@mail.com");
		
		System.out.println(emailField.getAttribute("value"));
		
	}

}
