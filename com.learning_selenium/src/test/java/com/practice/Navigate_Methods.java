package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().minimize();
	    driver.close();
        
		//to(String)
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");
	}

}
