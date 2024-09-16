package com.learning_JavaScript_Executers_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hidden_WebElement {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		WebElement element = driver.findElement(By.id("displayed-text"));
		
		//type cast driver into JavaScriptExecutor Interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//call method
		js.executeScript("arguments[0].value='aman'", element);
				

	}

}
