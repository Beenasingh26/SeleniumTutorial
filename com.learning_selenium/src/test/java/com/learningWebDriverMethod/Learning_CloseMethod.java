package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://student.qspiders.com/");
		
		Thread.sleep(5000);
		driver.close();

	}
}
