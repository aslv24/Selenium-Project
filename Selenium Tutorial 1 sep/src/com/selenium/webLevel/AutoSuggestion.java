package com.selenium.webLevel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement countryCodeField = driver.findElement(By.xpath("//div[@class='countryCodeText']"));

		countryCodeField.click();
		
		JavascriptExecutor script=(JavascriptExecutor)driver;
		
		script.executeScript("window.scrollBy(0,2000)");
		
		List<WebElement> countryCode = driver.findElements(By.xpath("//ul[contains(@style,'list')]/li"));
		
		System.out.println(countryCode.size());
		
		for (WebElement aa : countryCode) {
			System.out.println(aa.getText());
		}
		
		for (WebElement aa : countryCode) {
			String countryCodeText = aa.getText();
			if(countryCodeText.endsWith("(+993)"))
			{
				aa.click();
				break;
			}
		}
	}

}
