package com.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Explicit_Wait {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Register']")));
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-female")));
		driver.findElement(By.id("gender-female")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
		driver.findElement(By.id("FirstName")).sendKeys("Beena");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LastName")));
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		driver.findElement(By.id("Email")).sendKeys("beena1235@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
		driver.findElement(By.id("Password")).sendKeys("Beena@12345");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmPassword")));
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Beena@12345");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button")));
		driver.findElement(By.id("register-button")).click();
		
	}

}
