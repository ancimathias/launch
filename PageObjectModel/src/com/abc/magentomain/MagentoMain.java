package com.abc.magentomain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Main;

public class MagentoMain {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com/");
		
		Home h=new Home(driver);
		h.clickOnMyacct();
		
	Login l=new Login(driver);
	l.enterEmail("nikhildandge.abc@gmail.com");
	l.enterPass("Welcome123");
	l.clickOnLogin();
	
	Main m=new Main(driver);
	m.clickOnLogout();
		
		

	}

}
