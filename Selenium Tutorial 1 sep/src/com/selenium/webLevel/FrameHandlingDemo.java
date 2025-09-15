package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().frame("moneyiframe");

		WebElement element = driver.findElement(By.xpath("//span[@id='nseindex']"));

		System.out.println(element.getText());

		driver.switchTo().defaultContent();
	}

}
