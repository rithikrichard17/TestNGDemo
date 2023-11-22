package com.appTestNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	WebDriver driver;
	
	public void Openbrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
		
	@Test	
	public void Gettitle() {
		
		String actualtitle ="Your Store";
		String title = driver.getTitle();
		
		Assert.assertEquals(actualtitle, title);
		
		
		boolean seachbox = driver.findElement(By.className("form-control input-lg")).isDisplayed();
		
	    Assert.assertTrue(seachbox);
	    
	    driver.findElement(By.className("form-control input-lg")).sendKeys("mac");
	    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		
		
		
   }
	

}
