package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriortiyDemo {
	WebDriver driver;

	@Test(description="Testcase to open application")
	public void startapp()
	{
		System.out.println("Start application");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        
     
        driver.manage().window().maximize();
        System.out.println("I am Thread :"+ Thread.currentThread().getId());
	}
	
	@Test(priority = 1,description="Testcase to verify login functionality")
	public void login()
	{
		System.out.println("Successfully logged in");
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("rekhab");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        System.out.println("I am Thread :"+ Thread.currentThread().getId());
	}
	@Test(priority = 2,description="Testcase to verify Sign-off")
	public void signoff()
	{
		System.out.println("Sign off successfully");
	    driver.findElement(By.linkText("Log out")).click();
	    System.out.println("I am Thread :"+ Thread.currentThread().getId());
        driver.close();
	
	}
	
	

}
