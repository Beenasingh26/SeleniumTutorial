package com.learning_JavaScript_Executers_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_Login_Operation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button [text() = ' Login ']")).click();
		
		//using javascript executor
//		WebElement element = driver.findElement(By.name("username"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='Admin'", element);
//		Thread.sleep(2000);
//		WebElement element2 = driver.findElement(By.name("password"));
//		js.executeScript("arguments[0].value='admin123'", element2);
//		Thread.sleep(2000);
//		WebElement element3 = driver.findElement(By.xpath("//button [text() = ' Login ']"));
//		js.executeScript("arguments[0].click()", element3);
//		

	}

}
