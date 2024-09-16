package com.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Fetching_ProductDetails {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	    driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']")).sendKeys("shoes");
	    driver.findElement(By.xpath("//a[@class = 'desktop-submit']")).click();
	    driver.findElement(By.xpath("(//img[@class = 'img-responsive'])[1]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//h1[@class = 'pdp-title']"));
//	    System.out.println(element.getText());
//	    WebElement element1 = driver.findElement(By.xpath("//div[text() = '₹13,990']"));
//	    System.out.println(element1.getText());

	}

}
