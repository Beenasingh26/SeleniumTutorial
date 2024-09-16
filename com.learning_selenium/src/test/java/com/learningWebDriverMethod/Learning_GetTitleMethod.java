package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTitleMethod {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
//		Fetch the Title using getTitle() method
		String title = driver.getTitle();
		System.out.println(title);
		
//		is used for validation purpose
		if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
			System.out.println("Welcome page is displayed");
		}else {
			System.out.println("Invalid page displayed");
		}
		
		
		
	}

}
