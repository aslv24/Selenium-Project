package com.selenium.webLevel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		List<WebElement> aTag= driver.findElements(By.tagName("a"));
		
		List<WebElement> divTag= driver.findElements(By.tagName("div"));
		
		List<WebElement> inputTag= driver.findElements(By.tagName("input"));
		
		List<WebElement> ulTag= driver.findElements(By.tagName("ul"));
		
		List<WebElement> logeshTag= driver.findElements(By.tagName("logesh"));
		
		System.out.println(aTag.size());
		
		System.out.println(divTag.size());
		
		System.out.println(inputTag.size());
		
		System.out.println(ulTag.size());
		
		System.out.println(logeshTag.size());
		
		aTag.get(1).click();
		
	}

}
