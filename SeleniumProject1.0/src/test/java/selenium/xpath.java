package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath {
	
	WebDriver driver;
	String FLIPKART_URL="https://www.flipkart.com/";
	String OnlyTesting="http://only-testing-blog.blogspot.com/2014/09/temp.html";
	

	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(FLIPKART_URL);
	  
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();//support code
	  //Contains function
	  driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).click();
	  
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();//support code
	  //Descendant function
	  driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']//descendant::span[text()='Electronics']")).click();
	  
	  //Following-sibling function
	  driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']//following-sibling::li//a[text()='Speakers']")).click();
	  
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).click();//support code
	  //and function
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c' and @type='submit']")).click();
	  
	  //or function
	  driver.findElement(By.xpath("//input[@type='password' or @class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("cspl@1234");
	  
	  //starts-with function
	  driver.findElement(By.xpath("//button[starts-with(@class,'_2AkmmA _2')]")).click();
	  

       driver.get(OnlyTesting);	
       
      //last function
	   driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]")).click();
	
	   //position function
	   driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=1]")).click();
	  
  }
}
