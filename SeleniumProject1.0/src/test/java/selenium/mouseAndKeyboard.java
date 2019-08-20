package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseAndKeyboard {
	
	WebDriver driver;
	String SELENIUMFRAMEWORK_URL="https://www.softwaretestingmaterial.com/";
	String GURU99="http://demo.guru99.com/test/simple_context_menu.html";
	String JQUERY="https://jqueryui.com/resources/demos/droppable/default.html";
	String FB_URL="https://www.facebook.com/";
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(SELENIUMFRAMEWORK_URL);
	  
	  Actions action=new Actions(driver);
	  
	 /* action.clickAndHold(driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]"))).build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-4350']//descendant::span[text()='Selenium']"))).build().perform();
	  action.click(driver.findElement(By.xpath("//li[@id='menu-item-4350']//descendant::span[text()='TestNG']"))).build().perform();
	  action.contextClick(driver.findElement(By.xpath("//a[text()='Software Testing Material']"))).build().perform();
	  */
	  driver.get(GURU99);
	  
	  action.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();
	  Alert alert=driver.switchTo().alert();//support code
	  alert.accept();//support code
	  
	  driver.get(JQUERY);
	  
	  action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	  
	  driver.get(FB_URL);
	  
	  action.sendKeys(driver.findElement(By.id("u_0_l")), Keys.NUMPAD6).build().perform();
	  action.sendKeys(driver.findElement(By.id("u_0_l")), Keys.TAB).build().perform();
  }
}
