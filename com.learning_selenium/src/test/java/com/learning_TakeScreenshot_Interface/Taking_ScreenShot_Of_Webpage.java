package com.learning_TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_ScreenShot_Of_Webpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//Typecasting to Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		//we have taken screenshot, but it is present in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);//it is in RAM
		//We are creating the file in ROM/Main memory/System Memory
		File dest = new File("./screenshots/flipkartWelcomePage.png");
		//Copy the screenshot from RAM to Main Memory
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
		
		}

}
