package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class chromeOptions {
	
	WebDriver driver;
	String FLIPKART_URL="https://www.flipkart.com/";
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("disable-infobars");
	  System.out.println("Hide the infobars on chrome browser which is opened by selenium 'by default' ");
	  
	  //options.addArguments("--headless");
	  System.out.println("To execute test script in headless browser");
	  
	  //options.addArguments("user-data-dir=C://Users//aa//AppData//Local//Google//Chrome//User Data//Profile 2");
	  System.out.println("To launch the chrome instance by selenium in existing browser which is opened by user manually ");

	  //options.addExtensions(new File("C:\\Users\\aa\\Downloads\\AlexaToolbar_IE.exe") );
	   //options.addArguments("start-maximized");
	  
	  driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(FLIPKART_URL);
	  
  }
}
