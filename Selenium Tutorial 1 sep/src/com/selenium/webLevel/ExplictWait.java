package com.selenium.webLevel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://tnpsc.gov.in/home.aspx");
		
		String title = driver.getTitle();
		System.out.println(title);
	
		System.out.println(driver.getCurrentUrl());
		
		WebElement registerUserLink = driver.findElement(By.xpath("//h3[text()='Registered User']"));		
		
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("arguments[0].scrollIntoView();",registerUserLink);
		
		registerUserLink.click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		element.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		List<String> list= new ArrayList<String>(windows);
		
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());


	}

}
