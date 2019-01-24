package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home
{
By myacct=By.linkText("My Account");

WebDriver driver=null;
public Home(WebDriver driver)
{
	this.driver=driver;
}

public void clickOnMyacct()
{
	driver.findElement(myacct).click();
}
	

}


