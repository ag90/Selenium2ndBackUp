package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownHandling {
	
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
	  
	  /*JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,800)");*/
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(0,1400)");//support code
	  
	  
	  
	  Select select=new Select(driver.findElement(By.name("dropdown")));
	  select.selectByIndex(5);
	  Thread.sleep(2000);
	  select.selectByVisibleText("Selenium");
	  Thread.sleep(2000);
	  select.selectByValue("ddautomation");
	  
	  WebElement getfirstselectoption= select.getFirstSelectedOption();
	  String Current_Selected_Dropdown_Default_Value=getfirstselectoption.getText();
	  System.out.println("Dropdown_Default_Value is : " + Current_Selected_Dropdown_Default_Value);
	  
	  List<WebElement> getOptions= select.getOptions();
	  int Total_No_Dropdown_Value=getOptions.size();
	  System.out.println("Total_No_Dropdown_Value is : " + Total_No_Dropdown_Value);
	  
	  for (WebElement Value : getOptions) {
		
		  String Value_Text=Value.getText();
		  System.out.println("Value_Text is : " + Value_Text);

	  }
	  
	  Select select1=new Select(driver.findElement(By.name("multipleselect[]")));
	  
	  select1.selectByIndex(2);//support code
	  select1.selectByIndex(3);//support code
	  
	  List<WebElement> getAllSelectedOptions= select1.getAllSelectedOptions();
	  int Total_getAllSelectedOptions=getAllSelectedOptions.size();
	  System.out.println("Total_getAllSelectedOptions is : " +Total_getAllSelectedOptions);
	  
	  for (WebElement value : getAllSelectedOptions) {
		  
		  String value_Text=value.getText();
		  System.out.println("getAllSelectedOptions_Value_Text is : " + value_Text);
		  
		  
	}
	  
	  select1.deselectAll();
	  
  }
  
}
