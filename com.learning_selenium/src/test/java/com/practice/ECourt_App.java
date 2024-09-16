package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ECourt_App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:8080/e-court-ui/");
		Actions action = new Actions(driver);
		
		//Moving through each module of Admin
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Type your password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() = 'Cause List']")).click();
		Thread.sleep(3000);
		driver.navigate().to("http://localhost:8080/e-court-ui/cause-list");
		driver.findElement(By.xpath("//button[text() = 'View']")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/main/section[1]/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text() = 'Cancel'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt = 'logo']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[text() = 'Calendar']"));
		action.scrollToElement(element).perform();
		action.click(element).perform();
		Thread.sleep(5000);
		driver.navigate().to("http://localhost:8080/e-court-ui/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() = 'List Of Cases']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text() = 'View'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class = 'BreadCrumb_crumb__uDhtH']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class = 'TabsControl_tab__K+tsu TabsControl_activeTab__NBi-o']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class = 'TabsControl_tab__K+tsu false'])[2]")).click();

	}

}
