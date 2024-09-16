package com.learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_Multiple_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement monthDropDown = driver.findElement(By.name("Month"));
		Select sel = new Select(monthDropDown);
		sel.selectByIndex(3);
		sel.selectByValue("May");
		sel.selectByVisibleText("July");
		Thread.sleep(2000);
		
//		sel.deselectByIndex(3);
//		sel.deselectByValue("Ma");
//		sel.deselectByVisibleText("May");
//		
//		sel.deselectAll();
		
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			
			WebElement element = allOptions.get(i);
			System.out.println(element.getText());
		
		}
		driver.quit();
		

	}

}
