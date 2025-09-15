package com.selenium.browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();
	}

}
