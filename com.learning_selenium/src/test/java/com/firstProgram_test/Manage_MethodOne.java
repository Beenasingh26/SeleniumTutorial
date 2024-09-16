package com.firstProgram_test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_MethodOne {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Options opt = driver.manage();
		Window win = opt.window();
		Dimension size = win.getSize();
		System.out.println(size.height);
		System.out.println(size.width);
		
		Point pos = win.getPosition();
		System.out.println(pos.getX());
		System.out.println(pos.getY());
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		Options opt1 = driver.manage();
		Window win1 = opt1.window();
		Dimension size1 = win1.getSize();
		System.out.println(size1.height);
		System.out.println(size1.width);
		
		Point pos1 = win.getPosition();
		System.out.println(pos1.getX());
		System.out.println(pos1.getY());
		
	}

}
