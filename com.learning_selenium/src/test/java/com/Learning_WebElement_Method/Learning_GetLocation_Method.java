package com.Learning_WebElement_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetLocation_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		

	}

}
