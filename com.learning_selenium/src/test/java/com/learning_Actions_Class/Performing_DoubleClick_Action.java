package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_DoubleClick_Action {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		action.doubleClick(element).perform();
		
	}

}
