package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement element = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));

		JavascriptExecutor script = (JavascriptExecutor) driver;

		script.executeScript("arguments[0].scrollIntoView();", element);

		driver.switchTo().frame("courses-iframe");

		WebElement signup = driver.findElement(By.cssSelector("div.login-btn>a[href$='sign_up'][href*='courses']"));
		signup.click();

		driver.switchTo().defaultContent();
	}

}
