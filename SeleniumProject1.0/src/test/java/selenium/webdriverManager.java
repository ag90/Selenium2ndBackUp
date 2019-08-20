package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverManager {
	
	WebDriver driver;
	String GoogleURL="https://google.com";
  @Test
  public void WebDriverManager() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get(GoogleURL);
	  
	  
	  
	  
  }
}
