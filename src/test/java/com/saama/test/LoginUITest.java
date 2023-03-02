package com.saama.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saama.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test
	public void headerTest() {
		String header = driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(header, "Login");
	}
}
