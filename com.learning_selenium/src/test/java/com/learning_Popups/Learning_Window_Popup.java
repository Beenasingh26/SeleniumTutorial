package com.learning_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Window_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
			driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[1]")).click();
			
//			This is used to fetch the parent WindowID
			String parentWindowID = driver.getWindowHandle();
			System.out.println(parentWindowID);
//			This is used to fetch all windowIDs
			Set<String> allWindowID = driver.getWindowHandles();
			System.out.println(allWindowID);
//			This is used to remove parent windowID from allWindowIDs
			allWindowID.remove(parentWindowID);
			
			for(String windowID :allWindowID ) {
//				This is used to switch to the childWindow
				driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
				String text = driver.findElement(By.xpath("//span[@class = 'VU-ZEz']")).getText();
				System.out.println(text);
				driver.close();
				
			}
//			This line will switch back the control to parent window
			driver.switchTo().window(parentWindowID);
			driver.findElement(By.xpath("//a[@class = 'wsejfv']")).click();
	}

}
