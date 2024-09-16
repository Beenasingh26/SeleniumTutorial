package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Svg_tag {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type = 'text' and @value = 'Search store']")).sendKeys("Book");
		driver.findElement(By.xpath("//*[name() = 'svg' and @viewBox = '0 0 24 24]"));
		
	}

}
