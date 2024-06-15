package assignment_blazedemo_test;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignment_blazedemo.Mavenblazedemo;



public class Test_blazedemo {
	WebDriver driver;
	@BeforeTest
	public void tb()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void tb1()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void tst()
	{
		Mavenblazedemo mbd=new Mavenblazedemo(driver);
		mbd.start();
		mbd.sv("abc", "lpol", "helo@gmail.com", "pilm", "pilm");
		mbd.register();
	}

}
