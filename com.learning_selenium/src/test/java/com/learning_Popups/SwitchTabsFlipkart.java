package com.learning_Popups;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabsFlipkart {
    public static void main(String[] args) throws InterruptedException {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to a website
        driver.get("https://www.flipkart.com");

        // Search for mobiles
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("mobile");
        searchBox.sendKeys(Keys.ENTER);

        // Wait for the search results to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Open the first mobile link in a new tab
//        driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[1]"));
        for (int i = 1; i <= 4; i++) {
            driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[" + i + "]")).click();
            Thread.sleep(3000);// Wait for the tab to open
        }

        // Get the handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new tab
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Perform actions in the new tab
        System.out.println("New tab title: " + driver.getTitle());
        String mobileName = driver.findElement(By.xpath("//span[@class = 'VU-ZEz']")).getText();
        System.out.println("Mobile Name: " + mobileName);

        // Optionally, switch back to the parent window
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Parent window title: " + driver.getTitle());
        
        driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[5]")).click();
        driver.findElement(By.xpath("//button[@class = 'QqFHMw vslbG+ In9uk2']")).click();
        //driver.findElement(By.xpath("(//button[contains(@class, 'QqFHMw')])[1]")).click();

        // Close the browser
//        driver.quit();
    }
}
