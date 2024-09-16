package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_XpathBy_Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value = 'Search store']")).sendKeys("Footwear");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
	}

}
