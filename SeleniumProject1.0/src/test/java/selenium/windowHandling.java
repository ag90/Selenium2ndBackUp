package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowHandling {
	
	WebDriver driver;
	String NAUKRI_URL="https://www.naukri.com/nlogin/login";
	String NAUKRI_URL_2="https://www.naukri.com";
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(NAUKRI_URL_2);
	  
	  /*
	   driver.findElement(By.xpath("//ul[@class='midSec menu']//descendant::div[text()='Jobs']")).click();
	  
	    String ParentWindow=driver.getWindowHandle();
	    System.out.println("Parent window Id is : " +ParentWindow);
	   
	    
	    Set<String> MultipleChildWindow= driver.getWindowHandles();
	    System.out.println("MultipleChildWindow Id is : " + MultipleChildWindow);
	    int Total_MultipleChildWindow=MultipleChildWindow.size();
	    System.out.println("Total_MultipleChildWindow is : " + Total_MultipleChildWindow);
	    
	    for (String Windows : MultipleChildWindow) {
			
	    	if(!ParentWindow.equalsIgnoreCase(Windows))
	    	{
	    		driver.switchTo().window(Windows);
	    		driver.findElement(By.xpath("//ul[@class='midSec menu']//descendant::div[text()='Recruiters']")).click();
	    		String FirstChildWindow_Title=driver.getTitle();
	    		System.out.println("FirstChildWindow_Title is : "+FirstChildWindow_Title);
	    		
	    	}
		}
	    
	    Set<String> MultipleChildWindow1= driver.getWindowHandles();
	    System.out.println("MultipleChildWindow Id is : " + MultipleChildWindow1);
	    int Total_MultipleChildWindow1=MultipleChildWindow1.size();
	    System.out.println("Total_MultipleChildWindow1 is : " + Total_MultipleChildWindow1);
	    
	    for (String SecondWindowHandle : MultipleChildWindow1) {
			
	    	driver.switchTo().window(SecondWindowHandle);
	    	
	    	if (driver.getTitle().contentEquals("HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com")) {
			
	    		
	    		driver.findElement(By.xpath("//ul[@class='midSec menu']//descendant::div[text()='Recruiters']")).click();
	    		
			}
		}
		
		driver.switchTo().window(ParentWindow);
	    
	    
*/	   
	  Set<String> MultipleChildWindow2= driver.getWindowHandles();
	    System.out.println("MultipleChildWindow Id is : " + MultipleChildWindow2);
	    int Total_MultipleChildWindow2=MultipleChildWindow2.size();
	    System.out.println("Total_MultipleChildWindow1 is : " + Total_MultipleChildWindow2);
	    
	    for (String NaukriMultipleWindows : MultipleChildWindow2) {
		
	    	driver.switchTo().window(NaukriMultipleWindows);
	    	
	    	if (driver.getTitle().contentEquals("LnT")) {
			
	    		
	    		String LnT_Title=driver.getTitle();
	    		System.out.println("LnT_Title is : " + LnT_Title);
	    		
			}
		}
	    
	    
	    
	    
	    
		
	  
  }
}
