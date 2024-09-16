package com.firstProgram_test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com/");
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
		
		driver.navigate().to("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.flipkart.com/");
	

	}

}
