package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://student.qspiders.com/");
		int height = driver.manage().window().getSize().getHeight();
		System.out.println(height);
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(width);
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		
		//optimized way, Method chaining
		
		driver.manage().window().maximize();//used in every program after launching the browser 
		//Thread.sleep(5000);
		//driver.manage().window().fullscreen();
		//Thread.sleep(5000);
		//driver.manage().window().minimize();
		
		int height2 = driver.manage().window().getSize().getHeight();
		System.out.println(height2);
		int width2 = driver.manage().window().getSize().getWidth();
		System.out.println(width2);
		
		int x_axis = driver.manage().window().getPosition().getX();
		System.out.println(x_axis);
		int y_axis = driver.manage().window().getPosition().getY();
		System.out.println(y_axis);
		
		
	}

}

