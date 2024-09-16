package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		 
		//driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		
		//xpath to click on Search Button
		driver.findElement(By.name("q")).sendKeys("Footwear");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		Thread.sleep(5000);
		
//		//xpath to click on APPAREL & SHOES 
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
//		Thread.sleep(2000);
//		
//		//xpath to take subscription of NEWSLETTER 
//		driver.findElement(By.id("newsletter-email")).sendKeys("beena123@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();
//		Thread.sleep(5000);
//		
//		//xpath to click on Jewelry link from Left side bar CATEGORIES section
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[6]/a")).click();
   }

}
