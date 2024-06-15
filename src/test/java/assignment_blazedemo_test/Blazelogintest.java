package assignment_blazedemo_test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignment_blazedemo.Blazelogin;

public class Blazelogintest {
	WebDriver driver;
	@BeforeTest
	public void bl()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bl1()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void blt()
	{
		Blazelogin bg=new Blazelogin(driver);
		bg.start();
		bg.setvalues("sdfg@gmail.com", "polk");
		bg.login();
	}

}
