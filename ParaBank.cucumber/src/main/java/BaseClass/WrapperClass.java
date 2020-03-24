package BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass {
	
	public static WebDriver driver;
	
	
	public void launchBrowser(String browser ) throws IOException{
		String browserName=browser;
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\javacoding\\Parabank_Cucumber\\target\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\javacoding\\ParaBank.cucumber\\src\\main\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/IEDriver.exe");
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void getUrl(){
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}


}
