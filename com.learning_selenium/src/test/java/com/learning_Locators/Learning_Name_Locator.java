package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Name_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewsletterEmail")).sendKeys("singhbeena6386@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("newsletter-subscribe-button")).click();

	}

}
