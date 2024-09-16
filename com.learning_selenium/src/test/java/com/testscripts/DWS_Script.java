package com.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DWS_Script {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		Login DWS
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("beena1235@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Beena@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		Thread.sleep(2000);
//		Click on email id from top
		driver.findElement(By.xpath("//a[text() = 'beena1235@gmail.com']")).click();
		Thread.sleep(2000);
//		Click on address from left side
		driver.findElement(By.xpath("(//a[text() = 'Addresses'])[1]")).click();
		Thread.sleep(2000);
//		Click on Add New
		driver.findElement(By.xpath("//input[@value = 'Add new']")).click();
		Thread.sleep(2000);
//		Fill address and save
		driver.findElement(By.id("Address_FirstName")).sendKeys("Siya");
		driver.findElement(By.id("Address_LastName")).sendKeys("Sood");
		driver.findElement(By.id("Address_Email")).sendKeys("siya5566@gmai.com");
		driver.findElement(By.id("Address_Company")).sendKeys("IBM");
		WebElement dropdown = driver.findElement(By.id("Address_CountryId"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByValue("41");
		WebElement dropdown2 = driver.findElement(By.id("Address_StateProvinceId"));
		Select sel1 = new Select(dropdown2);
		Thread.sleep(2000);
		sel1.selectByValue("0");
		driver.findElement(By.id("Address_City")).sendKeys("Noida");
		driver.findElement(By.id("Address_Address1")).sendKeys("Delhi");
		driver.findElement(By.id("Address_Address2")).sendKeys("Uttar Pradesh");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("201301");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("8569926365");
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("8374843");
		driver.findElement(By.xpath("//input[@value = 'Save']")).click();
		Thread.sleep(5000);
//		Taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File src = ts.getScreenshotAs(OutputType.FILE); 
		File dest = new File("./screenshots/addressPage.png"); 
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.quit();
	}

}
