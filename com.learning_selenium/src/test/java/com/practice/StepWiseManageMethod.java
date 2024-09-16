package com.practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepWiseManageMethod {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Options opt = driver.manage();
		Window win = opt.window();
		Dimension size = win.getSize();
		int height = size.getHeight();
		System.out.println(height);
		int width = size.getWidth();
		System.out.println(width);
		Point pos = win.getPosition();
		int x_axis = pos.getX();
		System.out.println(x_axis);
		int y_axis = pos.getY();
		System.out.println(y_axis);

	}

}
