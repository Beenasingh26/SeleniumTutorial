package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("beenasingh2430@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Beena@1234");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		

	}

}
