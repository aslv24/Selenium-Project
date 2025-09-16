package com.selenium.webLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSuggestion {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement searchbarField = driver.findElement(By.name("q"));
		searchbarField.sendKeys("realme mobile");
		
		List<WebElement> productList = driver.findElements(By.xpath("//form[contains(@class,'header-form-search')]/ul/li"));
		
		System.out.println("Total Product List ::"+productList.size());
		
		//for printing the country code
		for (WebElement aa : productList) {
			System.out.println(aa.getText());
		}
		
		//for clicking the country code
		for (WebElement aa : productList) {
			String countryCode = aa.getText();
			if(countryCode.endsWith("bluetooth headphone"))
			{
				aa.click();
				break;
			}
		}
	}

}
