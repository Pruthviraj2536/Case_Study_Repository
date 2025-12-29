package Selenium_tasks.Swag_Labs;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Data_Povider_SWAGLABS {
	//data provider annotation>>>
	
	
  @Test(dataProvider = "data")
  public void f(String user_name, String Pass) {
	EdgeDriver  driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("user-name")).sendKeys("user_name");
		driver.findElement(By.id("password")).sendKeys("Pass");
		driver.findElement(By.id("login-button")).click();
		driver.navigate().back();
	  driver.close();
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] {"standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" },
      new Object[] { "error_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" },
    };
  }
}
