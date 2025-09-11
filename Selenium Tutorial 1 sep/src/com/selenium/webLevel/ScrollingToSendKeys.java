package com.selenium.webLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement emailField = driver.findElement(By.id("email"));

		JavascriptExecutor script = (JavascriptExecutor) driver;

		script.executeScript("arguments[0].value=('email@mail.com');", emailField);

		Thread.sleep(2000);

		script.executeScript("arguments[0].value=('');", emailField);

	}

}
