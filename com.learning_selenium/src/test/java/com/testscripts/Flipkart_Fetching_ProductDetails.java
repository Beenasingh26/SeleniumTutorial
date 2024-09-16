package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Fetching_ProductDetails {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.name("q")).sendKeys("Laptop", Keys.ENTER);
	    WebElement element = driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[1]"));
	    System.out.println(element.getText());
	    WebElement element1 = driver.findElement(By.xpath("//div[text() = '₹13,990']"));
	    System.out.println(element1.getText());
	 

	}

}
