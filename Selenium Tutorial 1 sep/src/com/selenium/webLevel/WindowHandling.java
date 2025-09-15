package com.selenium.webLevel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement termsLink = driver.findElement(By.cssSelector("a#terms-link"));
		termsLink.click();

		Set<String> windows = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windows);

		driver.switchTo().window(list.get(1));

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(list.get(0));

		WebElement maleRadioButton = driver.findElement(By
				.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));

		System.out.println(maleRadioButton.isDisplayed());// true
		System.out.println(maleRadioButton.isEnabled());// true

		boolean selected = maleRadioButton.isSelected();
		System.out.println(selected);// false

		if (!selected) {
			maleRadioButton.click();
		}

		System.out.println(maleRadioButton.isSelected());// true

	}

}
