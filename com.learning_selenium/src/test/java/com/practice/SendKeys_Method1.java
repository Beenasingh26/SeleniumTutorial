package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Method1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("beenasingh2430@gmail.com", Keys.TAB, "Beena@8009", Keys.ENTER);
	

	}

}
