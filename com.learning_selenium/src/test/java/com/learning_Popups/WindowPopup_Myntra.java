package com.learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup_Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class = 'desktop-searchBar']")).sendKeys("shirt");
		driver.findElement(By.xpath("//a[@class = 'desktop-submit']")).click();

		driver.findElement(By.xpath("(//img[@class = 'img-responsive'])[1]")).click();

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
			String text = driver.findElement(By.xpath("//h1[@class = 'pdp-name']")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("//p[text() = '38']")).click();
			driver.findElement(By.xpath("//div[contains(text(), 'ADD TO BAG')]")).click();
			driver.close();
		}
	
	}

}
