package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headlessBrowser {
	
	WebDriver driver;
	String SoftwareTesting_URL="https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";

  @Test
  public void f() {
	  
	  driver=new HtmlUnitDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(SoftwareTesting_URL);
	  
	  
	  driver.findElement(By.xpath("//a[text()='Software Testing Material']")).click();
	  
  }
}
