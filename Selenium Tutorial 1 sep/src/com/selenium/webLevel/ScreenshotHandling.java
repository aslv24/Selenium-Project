package com.selenium.webLevel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotHandling {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement maleRadioButton = driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));

		System.out.println(maleRadioButton.isDisplayed());//true
		System.out.println(maleRadioButton.isEnabled());//true

		boolean selected = maleRadioButton.isSelected();
		System.out.println(selected);//false

		File button = maleRadioButton.getScreenshotAs(OutputType.FILE);

		File screenshotToButton=new File("C:\\Users\\WELCOME234\\Desktop\\screenshot\\button.png");

		FileHandler.copy(button, screenshotToButton);

		if(!selected)
		{
		maleRadioButton.click();
		}

		System.out.println(maleRadioButton.isSelected());//true

		int a=10;

		float b=a;

		TakesScreenshot screen=(TakesScreenshot)driver;

		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);

		File screenshotTo=new File("C:\\Users\\WELCOME234\\Desktop\\screenshot\\screen.png");

		FileHandler.copy(screenshotAs, screenshotTo);

	}

}
