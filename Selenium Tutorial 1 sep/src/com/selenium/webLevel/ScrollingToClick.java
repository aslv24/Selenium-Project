package com.selenium.webLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToClick {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/legal/terms/update");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement element = driver.findElement(By.xpath("//a[text()='here'][contains(@href,'over')]"));
		
		JavascriptExecutor script=(JavascriptExecutor)driver;
		
		script.executeScript("arguments[0].scrollIntoView();",element);
		
		Thread.sleep(2000);
		
		script.executeScript("arguments[0].click();",element);
		
	}

}
