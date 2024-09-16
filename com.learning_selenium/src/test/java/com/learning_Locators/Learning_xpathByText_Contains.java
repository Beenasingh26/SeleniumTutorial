package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_xpathByText_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(), 'Digital downloads')])[1]")).click();
		String text = driver.findElement(By.xpath("//h1[contains(text(), 'Digital downloads')]")).getText();
		
		if(text.equals("Digital downloads")) {
			System.out.println("Digital downloads page is displayed....");
		}else {
			System.out.println("Digital downloads page is not displayed");
		}
		

	}

}
