package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_Action {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text() = 'Fashion']"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//a[text() = 'Women Footwear']"));
		action.moveToElement(element2).build().perform();
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("//a[text() = 'Women Slipper Flip Flops']"));
		action.moveToElement(element3).click().perform();
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.xpath("//h1[@class = 'BUOuZu']"));
		System.out.println(element4.getText());
		
		//Optimized way
		                                   	
		driver.close();
		

	}

}
