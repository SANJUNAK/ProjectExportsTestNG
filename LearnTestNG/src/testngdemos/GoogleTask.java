package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTask {
	WebDriver driver;
	      @BeforeMethod
	      void openapplication() {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	        driver.get("https://www.google.com/");
	        
	        driver.manage().window().maximize();}
	        
	        @Test
	        public void checkurl() {
	        
	        	
	        String ActualTitle = driver.getTitle();
	        System.out.println(ActualTitle);
	        Assert.assertEquals(ActualTitle,"Google");}
	        
	        @Test(priority=1)
	        	public void checkLogo() {
	        		boolean view=driver.findElement(By.xpath("//*[@alt='Google']")).isSelected();
	        		Assert.assertTrue(view);
	        		System.out.println("Pass");
	        		
	        	}
	        @AfterMethod
	        public void closebrowser() {
	        	driver.close();
	        	
	        }
	      
	    
	      
	      }
	      
	       
	        
	        
	        
	        

		

	



