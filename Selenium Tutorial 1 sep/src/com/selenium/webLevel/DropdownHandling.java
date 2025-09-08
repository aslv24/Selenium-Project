package com.selenium.webLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown=new Select(day);
		dayDropdown.selectByIndex(2);
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropdown=new Select(month);
		monthDropdown.selectByValue("12");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown=new Select(year);
		yearDropdown.selectByVisibleText("2002");
		
		List<WebElement> allYears = yearDropdown.getOptions();
		
		System.out.println(allYears.size());
		
		for (WebElement aa : allYears) {
			System.out.println(aa.getText());
		}
		
	}

}
