package Selenium_tasks.MAVEN_PROJECT_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Setpup_calcy {
  
	ChromeDriver driver;
	
	@BeforeSuite
   public void Launch()
  
  {
		driver= new ChromeDriver();
	  driver.get("https://www.calculator.net/");
	  driver.manage().window().maximize();
	  
  }
	
	
	
}
