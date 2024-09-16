package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Operation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
//		WebElement source1 = driver.findElement(By.id("box1"));
//		WebElement target1 = driver.findElement(By.id("box101"));
//		WebElement source2 = driver.findElement(By.id("box2"));
//		WebElement target2 = driver.findElement(By.id("box102"));
//		WebElement source3 = driver.findElement(By.id("box3"));
//		WebElement target3 = driver.findElement(By.id("box103"));
//		WebElement source4 = driver.findElement(By.id("box4"));
//		WebElement target4 = driver.findElement(By.id("box104"));
//		WebElement source5 = driver.findElement(By.id("box5"));
//		WebElement target5 = driver.findElement(By.id("box105"));
//		WebElement source6 = driver.findElement(By.id("box6"));
//		WebElement target6 = driver.findElement(By.id("box106"));
//		WebElement source7 = driver.findElement(By.id("box7"));
//		WebElement target7 = driver.findElement(By.id("box107"));
//		
//		Actions action = new Actions(driver);
//		action.dragAndDrop(source1, target1).perform();
//		Thread.sleep(2000);
//		
//		action.dragAndDrop(source2, target2).perform();
//		Thread.sleep(2000);
//		
//		action.dragAndDrop(source3, target3).perform();
//		Thread.sleep(2000);
//		
//		action.dragAndDrop(source4, target4).perform();
//		Thread.sleep(2000);
//		
//		action.dragAndDrop(source5, target5).perform();
//		Thread.sleep(2000);
//		
//		action.dragAndDrop(source6, target6).perform();
//		Thread.sleep(2000);
//		
//		action.dragAndDrop(source7, target7).perform();
//		Thread.sleep(2000);
//
//		action.dragAndDrop(source1, driver.findElement(By.id("capitals"))).perform();
//		action.dragAndDrop(source2, driver.findElement(By.id("capitals"))).perform();
//		action.dragAndDrop(source3, driver.findElement(By.id("capitals"))).perform();
//		action.dragAndDrop(source4, driver.findElement(By.id("capitals"))).perform();
//		action.dragAndDrop(source5, driver.findElement(By.id("capitals"))).perform();
//		action.dragAndDrop(source6, driver.findElement(By.id("capitals"))).perform();
//		action.dragAndDrop(source7, driver.findElement(By.id("capitals"))).perform();
		
		//optimized code
		
		// Define source and target element IDs
        String[] sourceIds = {"box1", "box2", "box3", "box4", "box5", "box6", "box7"};
        String[] targetIds = {"box101", "box102", "box103", "box104", "box105", "box106", "box107"};
        String commonTargetId = "capitals";

        // Create an instance of Actions class
        Actions action = new Actions(driver);

        // Perform drag and drop for each pair of elements
        for (int i = 0; i < sourceIds.length; i++) {
            WebElement sourceElement = driver.findElement(By.id(sourceIds[i]));
            WebElement targetElement = driver.findElement(By.id(targetIds[i]));
            action.dragAndDrop(sourceElement, targetElement).perform();
            Thread.sleep(2000);  // Optional delay for observation
        }

        // Drag and drop each source element to the common target
        WebElement commonTargetElement = driver.findElement(By.id(commonTargetId));
        for (String sourceId : sourceIds) {
            WebElement sourceElement = driver.findElement(By.id(sourceId));
            action.dragAndDrop(sourceElement, commonTargetElement).perform();
        }

        // Close the browser
        driver.quit();
	    
	}

}
