package com.selenium.browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
	}

}
