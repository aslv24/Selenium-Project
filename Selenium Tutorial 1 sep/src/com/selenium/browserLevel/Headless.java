package com.selenium.browserLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--headless");

		WebDriver driver = new EdgeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();
	}

}
