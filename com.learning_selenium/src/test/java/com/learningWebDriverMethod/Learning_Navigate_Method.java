package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
		//to(String)
		
		driver.navigate().to("https://chat.qspiders.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://chat.qspiders.com/student-dashboard");
		Thread.sleep(2000);
		driver.navigate().to("https://chat.qspiders.com/student-dashboard/QCO-SOEJVD-M21");
		
		}

}
