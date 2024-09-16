package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		
		//optimize way to manage methods (Method Chaining)		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Dimension and Position after maximize		
		int height1 = driver.manage().window().getSize().getHeight();
		System.out.println("Height1: " +height1);
		int width1 = driver.manage().window().getSize().getWidth();
		System.out.println("Width1: " +width1);
		
		int x_axis1 = driver.manage().window().getPosition().getX();
		System.out.println("x-axis1: " +x_axis1);
		int y_axis1 = driver.manage().window().getPosition().getY();
		System.out.println("y-axis1: " +y_axis1);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//Dimension and Position after minimize		
		int height2 = driver.manage().window().getSize().getHeight();
		System.out.println("Height2: " +height2);
		int width2 = driver.manage().window().getSize().getWidth();
		System.out.println("Width2: " +width2);
		
		int x_axis2 = driver.manage().window().getPosition().getX();
		System.out.println("x-axis2: " +x_axis2);
		int y_axis2 = driver.manage().window().getPosition().getY();
		System.out.println("y-axis: " +y_axis2);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//Dimension and Position after fullscreen		
		int height3 = driver.manage().window().getSize().getHeight();
		System.out.println("Height3: " +height3);
		int width3 = driver.manage().window().getSize().getWidth();
		System.out.println("Width3: " +width3);
		
		int x_axis3 = driver.manage().window().getPosition().getX();
		System.out.println("x-axis3: " +x_axis3);
		int y_axis3 = driver.manage().window().getPosition().getY();
		System.out.println("y-axis3: " +y_axis3);
		
	}

}
