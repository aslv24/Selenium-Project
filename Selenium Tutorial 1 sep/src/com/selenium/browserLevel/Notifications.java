package com.selenium.browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized","--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.axisbank.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

	}

}
