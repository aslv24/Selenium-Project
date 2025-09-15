package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		Actions act=new Actions(driver);

		WebElement serviceElement = driver.findElement(By.xpath("//div[text()='Services']"));

		act.moveToElement(serviceElement).perform();

		WebElement scoreElement = driver.findElement(By.xpath("//div[text()='Resume quality score']"));


		act.click(scoreElement).perform();

	}

}
