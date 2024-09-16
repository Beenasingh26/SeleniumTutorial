package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_XpathByAttribute_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[contains(@class,'search-box-button')]")).click();

	}

}
