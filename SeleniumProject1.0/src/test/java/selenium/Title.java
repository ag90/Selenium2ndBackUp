package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Title {
	
	WebDriver driver;
	String FLIPKART_URL="https://www.flipkart.com/";
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get(FLIPKART_URL);
	  
	  String FLIPKART_TITLE=driver.getTitle();
	  System.out.println("FLIPKART_HOME_PAGE_TITLE is : " + FLIPKART_TITLE);
  }
}
