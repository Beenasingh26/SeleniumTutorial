package com.testscripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DWS_JsExecutor_Script {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
//		Login to DWS
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("beena1235@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Beena@12345");
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
//		scroll to product and add to cart
		WebElement element = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", element);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Joya");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("joya8877@gmail.com");
		driver.findElement(By.id("add-to-cart-button-2")).click();
//		Scroll to Shopping cart link then click
		WebElement element2 = driver.findElement(By.xpath("//span[text() = 'Shopping cart']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element2);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", element2);
//		Taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File src = ts.getScreenshotAs(OutputType.FILE); 
		File dest = new File("./screenshots/cartPage.png"); 
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
//		Removing from cart
		driver.findElement(By.xpath("//input[@value = '4279908']")).click();
		Thread.sleep(2000);
//		Again Taking screenshot
		TakesScreenshot ts1 = (TakesScreenshot) driver; 
		File src1 = ts1.getScreenshotAs(OutputType.FILE); 
		File dest1 = new File("./screenshots/cartPage1.png"); 
		FileHandler.copy(src1, dest1);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
