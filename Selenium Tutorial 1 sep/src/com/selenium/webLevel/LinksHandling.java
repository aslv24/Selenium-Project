package com.selenium.webLevel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		List<WebElement> aTag= driver.findElements(By.tagName("a"));
		
		int size = aTag.size();
		
		System.out.println("Overall links present in the webpage count :"+size);
		
		for(int i=0; i<size;i++)
		{
		System.out.println(aTag.get(i).getText()+"======"+aTag.get(i).getAttribute("href"));
		}
		
		
		
	}

}
