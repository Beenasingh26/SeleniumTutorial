package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_DragAndDrop_Operation {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		WebElement source = driver.findElement(By.id("box7"));
		WebElement target = driver.findElement(By.id("box107"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		action.dragAndDrop(source, driver.findElement(By.id("capitals"))).perform();

	}

}
