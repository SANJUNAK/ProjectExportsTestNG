package testngdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderMethod {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String  email, String password) {
	  driver.get("http://demowebshop.tricentis.com/login");
      
	     
      driver.manage().window().maximize();
      driver.findElement(By.id("Email")).sendKeys(email);
      driver.findElement(By.name("Password")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
      driver.findElement(By.linkText("Log out")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
		  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	   new Object[] { "ksanjuna1@gmail.com", "sanju1" },
    	      new Object[] { "rekhabr1@gmail.com", "rekhab" },
    	      new Object[] { "rekhabr3@gmail.com", "rekhab" }

    };
  }
}
