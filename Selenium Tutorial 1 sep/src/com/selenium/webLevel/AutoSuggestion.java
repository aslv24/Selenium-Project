package com.selenium.webLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement mobileNumberField = driver.findElement(By.xpath("//div[@class='countryCodeText']"));
		mobileNumberField.click();
		
		JavascriptExecutor script=(JavascriptExecutor)driver;

		script.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		List<WebElement> countryList = driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));
		
		System.out.println("Total Country List ::"+countryList.size());
		
		//for printing the country code
		for (WebElement aa : countryList) {
			System.out.println(aa.getText());
		}
		
		//for clicking the country code
		for (WebElement aa : countryList) {
			String countryCode = aa.getText();
			if(countryCode.endsWith("(+998)"))
			{
				aa.click();
				break;
			}
		}
	}

}
