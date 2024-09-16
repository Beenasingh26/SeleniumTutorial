package com.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_WindowPopup_Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);

		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[1]")).click();
		
//		This is used to fetch the parent WindowID
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
//		This is used to fetch all windowIDs
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println(allWindowID);
//		This is used to remove parent windowID from allWindowIDs
		allWindowID.remove(parentWindowID);
		
		for(String windowID :allWindowID ) {
//			This is used to switch to the childWindow
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			String text = driver.findElement(By.xpath("//span[@class = 'VU-ZEz']")).getText();
			System.out.println(text);
			Thread.sleep(3000);
			driver.close();
		}
		
		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[3]")).click();
		
//		This is used to fetch the parent WindowID
		String parentWindowID1 = driver.getWindowHandle();
		System.out.println(parentWindowID1);
//		This is used to fetch all windowIDs
		Set<String> allWindowID1 = driver.getWindowHandles();
		System.out.println(allWindowID1);
//		This is used to remove parent windowID from allWindowIDs
//		allWindowID.remove(parentWindowID1);
		
		for(String windowID :allWindowID1 ) {
//			This is used to switch to the childWindow
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			String text = driver.findElement(By.xpath("//span[@class = 'VU-ZEz']")).getText();
			System.out.println(text);
			Thread.sleep(3000);
			driver.close();
		}
		
//		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[10]")).click();
//		driver.close();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[13]")).click();
//		driver.close();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[21]")).click();
//		driver.close();

		
	}

}
