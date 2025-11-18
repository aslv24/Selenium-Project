package com.selenium.webLevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		List<WebElement> table = driver.findElements(By.xpath("html/body/div[6]/div[1]/table"));
//		
//		for (WebElement aa : table) {
//			System.out.println(aa.getText());
//		}
		
		List<WebElement> tableRows = driver.findElements(By.xpath("html/body/div[6]/div[1]/table/tbody/tr"));
		
		int rowCount = tableRows.size();
		
		System.out.println(rowCount);
		
		for(int i=1; i<=rowCount;i++)
		{
			List<WebElement> tableColumns = driver.findElements(By.xpath("html/body/div[6]/div[1]/table/tbody/tr["+i+"]/td"));
			
			int columnCount = tableColumns.size();
			
			for(int j=1; j<=columnCount; j++)
			{
				WebElement tableData = driver.findElement(By.xpath("html/body/div[6]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
				String text = tableData.getText();
				System.out.print(text+"|");
			}
			System.out.println();
		}
	}

}
