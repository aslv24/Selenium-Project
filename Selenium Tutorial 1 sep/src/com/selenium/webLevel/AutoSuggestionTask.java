package com.selenium.webLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTask {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement searchbarField = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		searchbarField.sendKeys("infomats");
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@role='presentation']/div/div/ul/li"));
		
		System.out.println(suggestionList.size());
		
		for (WebElement aa : suggestionList) {
			System.out.println(aa.getText());
		}
		
		for (WebElement aa : suggestionList) {
			String listName = aa.getText();
			if(listName.endsWith("by owner"))
			{
				aa.click();
				break;
			}
		}
	}

}
