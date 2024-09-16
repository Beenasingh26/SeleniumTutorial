package com.Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Validation_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		checkBox.click();
		Thread.sleep(1000);
		checkBox.click();
		System.out.println(checkBox.isSelected());
		System.out.println("====================");
		
		if(checkBox.isDisplayed()) {
			System.out.println(checkBox.isDisplayed());
			if(checkBox.isEnabled()) {
				System.out.println(checkBox.isEnabled());
				System.out.println(checkBox.isSelected());
			}
		}
		
		
	}

}
