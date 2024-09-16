package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_Click_Action {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text() = 'Login']"));
		action.moveToElement(element).click().perform();
		driver.close();

	}

}
