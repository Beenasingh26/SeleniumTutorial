package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CURRENT URL: " +currentUrl);
		
		String title = driver.getTitle();
		System.out.println("TITLE: " +title);
		
		//call getPageSource() to fetch html source code
		String sourceCode = driver.getPageSource();
		System.out.println("SOURCE CODE: " +sourceCode);
		
		Thread.sleep(5000);
		driver.close();

	}

}
