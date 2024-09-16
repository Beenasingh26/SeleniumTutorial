package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Method2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		driver.findElement(By.xpath("//input[@value = 'F']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Beena", Keys.TAB, "Singh", Keys.TAB, "beenasingh34@gmail.com", Keys.TAB, "Beena#1234", Keys.TAB, "Beena#1234", Keys.ENTER);

	}

}
