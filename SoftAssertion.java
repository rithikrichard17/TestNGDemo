package com.appTestNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void getTitle() {
		
		SoftAssert sf = new SoftAssert();
		
		String expectedTitle = "Your Title";
		String actualtitle = driver.getTitle();
		
		sf.assertEquals(expectedTitle, actualtitle,"TheTitle does not match");
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
	}
	
      
      
      

}
