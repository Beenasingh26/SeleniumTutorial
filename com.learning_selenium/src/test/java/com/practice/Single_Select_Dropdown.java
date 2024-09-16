package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(1000);
		
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select sel = new Select(countryDropdown);
		List<WebElement> option = sel.getOptions();
		for(int i = 0; i<option.size(); i++) {
			
			sel.selectByIndex(i);
			Thread.sleep(500);
		}
	}

}
