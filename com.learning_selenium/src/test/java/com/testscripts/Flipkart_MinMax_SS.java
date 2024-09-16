package com.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_MinMax_SS {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.name("q")).sendKeys("Laptop", Keys.ENTER);
	    WebElement dropdown = driver.findElement(By.xpath("(//select[@class = 'Gn+jFg'])[1]"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[@class = 'Gn+jFg'])[2]"));
		 Select sel1 = new Select(dropdown2);
		Thread.sleep(2000);
		sel1.selectByVisibleText("₹60000");
		
		//Taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/productPage.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
