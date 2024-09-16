package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCurrentUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
//		Method to fetch the url - getCurrentUrl()
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.myntra.com/")) {
			System.out.println("Welcome page displayed");
		}else {
			System.out.println("Welcome page is not displayed");
		}

	}

}
