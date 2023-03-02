package com.saama.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saama.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper{
	
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Boolean isDisplayed = driver.findElement(By.xpath("//h6")).isDisplayed();
		//Assert.assertTrue(isDisplayed, "Header Displayed");
		String headerText = driver.findElement(By.xpath("//h6")).getText();
		Assert.assertEquals(headerText, "Dashboard");
	}
}
