package com.selenium.webLevel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUp {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor script=(JavascriptExecutor)driver;

		script.executeScript("window.scrollBy(0,2634)");

		Thread.sleep(2000);

		script.executeScript("window.scrollBy(0,-2634)");

	}

}
