package Selenium_tasks.Swag_Labs;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Negative_SWAG_LAB {
  @Test(dataProvider = "Swag_Labs")
  public void f(String User_name, String Pass) {
	  EdgeDriver driver=new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys("User_name");
	  driver.findElement(By.id("password")).sendKeys("Pass");
	  driver.findElement(By.id("login-button")).click();
	  driver.close();
  }

  @DataProvider
  public Object[][] Swag_Labs() {
    return new Object[][] {
      new Object[] {"standard_user", "secret_sauce" },
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" }
    };
  }

  
}
