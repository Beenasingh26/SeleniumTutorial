package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_XpathBy_VisibleText {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		String text = driver.findElement(By.xpath("//h1[text() = 'Register']")).getText();
		
		if(text.equals("Register")) {
			System.out.println("Register page is displayed...");
			System.out.println(text);
		}else {
			System.out.println("Register page is not displayed");
		}

	}

}
