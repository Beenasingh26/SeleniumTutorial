package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetPageSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
//		call getPageSource() method to fetch html source code
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

	}

}
