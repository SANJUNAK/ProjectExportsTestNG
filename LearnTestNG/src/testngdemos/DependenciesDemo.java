package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependenciesDemo {
	WebDriver driver;

	@Test
	public void startapp()
	{
		System.out.println("Start application");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        
     
        driver.manage().window().maximize();
	}
	
	@Test(dependsOnMethods = "startapp")
	public void loginapp()
	{
		System.out.println("Successfully logged in");
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("rekhab");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(dependsOnMethods = "loginapp")
	public void signoff()
	{
		System.out.println("Sign off successfully");
	    driver.findElement(By.linkText("Log out")).click();
        driver.close();
	}

}
