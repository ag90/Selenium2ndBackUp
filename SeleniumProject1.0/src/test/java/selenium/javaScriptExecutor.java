package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecutor {
	
	WebDriver driver;
	 String SoftwareTesting_URL="https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";
	
 @Test
 public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(SoftwareTesting_URL);
	  
	  JavascriptExecutor jce=(JavascriptExecutor)driver;
	  jce.executeScript("scroll(0,1500)");
	  
	  Thread.sleep(5000);
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(0,0)");
	
  }
}
