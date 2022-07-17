package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;





public class BaseClass1 {

	@Parameters("browser")
	public static WebDriver getWebDriver(String a) 
	{
	   
	   if(a.equals("chrome"))
	   {
	        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
	    	
	    	
			WebDriver driver = new ChromeDriver();      //upcasting
			
			driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

			
			driver.manage().window().maximize();      //for maximize the method
			
			return driver;
	   }
	   else
	   {
		   System.setProperty("webdriver.gecko.driver", "F:\\Pandit\\Required Document\\Selenium\\Firefox\\geckodriver.exe"); // Setting system properties of FirefoxDriver
			
		    WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
				
				driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

				
				driver.manage().window().maximize();      //for maximize the method
				
				return driver;   
	   }
	
	
    }
}
