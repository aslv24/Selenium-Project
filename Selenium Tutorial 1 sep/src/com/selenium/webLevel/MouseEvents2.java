package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		Actions act=new Actions(driver);

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame);

		WebElement fromElement = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement toElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(fromElement, toElement).perform();
	}

}
