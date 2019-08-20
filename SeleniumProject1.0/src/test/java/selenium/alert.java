package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alert {
	
	WebDriver driver;
	String SELENIUMEASY_URL="https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(SELENIUMEASY_URL);
	  
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();//support code
	  Alert alert=driver.switchTo().alert();// Switch the focus on java script alert
	  
	  alert.accept();//click on OK button which is available on java script alert
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();//support code
	  alert.dismiss();
	  
	  driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();//support code
	  alert.sendKeys("avi.g");
	  Thread.sleep(5000);
	  alert.accept();
	  
	  

  }
}
