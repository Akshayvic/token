package assignment_blazedemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Blazelogin {
	WebDriver driver;
	

		By loginbuton=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
		By email=By.id("email");
		By password=By.id("password");
		By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
		

	public Blazelogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void start()
	{
		driver.findElement(loginbuton).click();
	}
	public void setvalues(String mail,String passw)
	{
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(passw);
	}
	public void login()
	{
		driver.findElement(login).click();
	}

}
