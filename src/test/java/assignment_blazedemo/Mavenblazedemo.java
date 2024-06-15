package assignment_blazedemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Mavenblazedemo {
	WebDriver driver;
		
		By name=By.id("name");
		By company=By.id("company");
		By email=By.id("email");
		By password=By.id("password");
		By newpassword=By.id("password-confirm");
		By registerbutton=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
		
	
	public  Mavenblazedemo(WebDriver driver)
	{
		this.driver=driver;
	}
	public void start()
	{
		driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[2]/a")).click();
	}
	public void sv(String nm,String cm,String mail,String pw,String npw)
	{
		driver.findElement(name).sendKeys(nm);
		driver.findElement(company).sendKeys(cm);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(newpassword).sendKeys(npw);
	}
	public void register()
	{
		driver.findElement(registerbutton).click();
	}
	
	

}
