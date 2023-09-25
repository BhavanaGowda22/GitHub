package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.LoginPage;

public class BaseClass {
	public static WebDriver driver;
@BeforeTest
	public void openbrowser() 
	{
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("Login");
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
	}
@AfterMethod
	public void logout()
	{
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
	}
@AfterTest
	public void closeBrowser()
	{
	driver.quit();
	}

}
