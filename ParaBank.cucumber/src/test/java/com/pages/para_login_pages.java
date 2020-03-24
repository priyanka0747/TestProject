package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class para_login_pages {
	
WebDriver driver;
	
	By username=By.name("username");
	   By password=By.name("password");
	   By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	   By logout=By.partialLinkText("Log Out");
	   

	public para_login_pages(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   
		
		  public void launch() 
		  { System.setProperty("webdriver.chrome.driver", "E:\\Project related\\845187(2)\\Parabank_Cucumber\\src\\test\\resources\\Drivers\\chromedriver_v80.exe" ); 
		  driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  }
		  
		  public void openApplication() 
		  {
		  driver.get("https://parabank.parasoft.com/parabank/index.htm");
		  }
		 
   
   public void enterUsername()
   {
	   driver.findElement(username).sendKeys("hari0");
   }
   
   public void enterPassword()
   {
	   driver.findElement(password).sendKeys("hari01");
   }
   
   public void logInButton() throws InterruptedException
   {
	   driver.findElement(login).click();
	   Thread.sleep(4000);
	   driver.findElement(logout).click();
	   driver.close();
   }


}
