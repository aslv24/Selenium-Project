package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.icicibank.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement closeButton = driver.findElement(By.xpath("//button[@class='cookie-close-icon']"));
		closeButton.click();
		WebElement account = driver.findElement(By.xpath("//a[contains(@href,'CMS_accounts_NLI')]"));
		account.click();

	}

}
