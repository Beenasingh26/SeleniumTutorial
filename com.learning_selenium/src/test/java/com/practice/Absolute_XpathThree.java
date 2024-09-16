package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_XpathThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//xpath to take subscription of NEWSLETTER 
		driver.findElement(By.id("newsletter-email")).sendKeys("beena123@gmail.com");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();

	}

}
