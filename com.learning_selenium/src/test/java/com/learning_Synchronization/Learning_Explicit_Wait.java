package com.learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Shop"));
		
		//Whether login link is clickable or not
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		driver.findElement(By.linkText("Log in")).click();
		
		//We are in correct web page or not
		wait.until(ExpectedConditions.urlContains("login"));
		
		driver.findElement(By.name("Email")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("nikhil123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Log in']")));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
