package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		Actions act=new Actions(driver);

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		act.contextClick(rightClick).perform();

		WebElement copyElement = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		act.click(copyElement).perform();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();

		WebElement doubleClickElement = driver.findElement(By.xpath("//button[contains(text(),'To')]"));

		act.doubleClick(doubleClickElement).perform();
		
		System.out.println(alt.getText());
	}

}
