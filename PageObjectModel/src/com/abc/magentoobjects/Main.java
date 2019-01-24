package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main
{
	By logout=By.linkText("Log Out");

	WebDriver driver=null;
	public Main(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
}
