package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame
{
	
 WebDriver driver;
 String GlobalSQA="http://hugelearning.com/iframe-practice-page/";
 

@Test
public void f() {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get(GlobalSQA);
  
      
      driver.switchTo().frame(0);
      driver.findElement(By.name("First_Name")).sendKeys("AVI");
      
      driver.switchTo().parentFrame();
      
      driver.switchTo().frame("iframe1");
      driver.findElement(By.name("Last_Name")).sendKeys("G");
      
      driver.switchTo().parentFrame();
      
      driver.switchTo().frame(driver.findElement(By.id("IFrame2")));
      boolean Frame2Displayed=driver.findElement(By.xpath("//h2[text()='Frame2']")).isDisplayed();
      System.out.println(Frame2Displayed);
      
      
  
  }
}
