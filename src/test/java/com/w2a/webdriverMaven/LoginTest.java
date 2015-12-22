package com.w2a.webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException{
		
		driver=new FirefoxDriver();
//		driver.wait(3000L);
		
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("https://www.google.com");
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("Email")).sendKeys("sneha");
		
		
	}
//	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
}
