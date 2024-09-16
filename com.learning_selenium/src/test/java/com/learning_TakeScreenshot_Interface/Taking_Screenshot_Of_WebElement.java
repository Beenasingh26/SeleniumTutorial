package com.learning_TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_Screenshot_Of_WebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com//");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("Register"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/registerLink.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
