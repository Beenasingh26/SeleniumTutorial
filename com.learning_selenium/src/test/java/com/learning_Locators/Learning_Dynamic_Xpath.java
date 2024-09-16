package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Dynamic_Xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text() = '$25 Virtual Gift Card']/../..//input[@value = 'Add to cart']")).click();	
//		driver.findElement(By.xpath("//a[text() = '14.1-inch Laptop']/../..//input[@value = 'Add to cart']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Build your own cheap computer']/../..//input[@value = 'Add to cart']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Build your own computer']/../..//input[@value = 'Add to cart']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Build your own expensive computer']/../..//input[@value = 'Add to cart']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Simple Computer']/../..//input[@value = 'Add to cart']")).click();
		
	}

}
