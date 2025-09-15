package com.selenium.webLevel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement loginButton = driver.findElement(By.className("signin-btn"));
		loginButton.click();

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		alt.accept();



	}

}
