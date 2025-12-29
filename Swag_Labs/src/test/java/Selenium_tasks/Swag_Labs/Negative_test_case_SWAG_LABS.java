package Selenium_tasks.Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Negative_test_case_SWAG_LABS {
	EdgeDriver driver;
  @BeforeMethod
  public void f() {
	  driver=new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  
  }

  	//Epic sadface: Sorry, this user has been locked out.
  	//1.validate Error message is showing or not after entering wrong details
  @Test(priority=3)
  void error_messaeg_validation() throws InterruptedException
  {
	  driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  WebElement message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
	  String expected_message="Epic sadface: Sorry, this user has been locked out.";
	  String actual_messaage=message.getText();
	  Assert.assertEquals(actual_messaage, expected_message, "TEST fail NO ERROR MESSAGE IS SHOWING");
	  System.out.println("Test PASS ERROr messaeg is showing when entered wrong username");
	  driver.close();
  }
  
  	//2.to verify that First name field is accepting number or not 
  	@Test(priority=2)
  	void first_name() throws InterruptedException
  	{
  		driver.findElement(By.id("user-name")).sendKeys("standard_user");
  	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  	  driver.findElement(By.id("login-button")).click();
  		  Thread.sleep(2000);
  		  driver.findElement(By.className("shopping_cart_link")).click();
  		  driver.findElement(By.id("checkout")).click();
  		driver.findElement(By.id("first-name")).sendKeys("1234");
  		driver.findElement(By.id("last-name")).sendKeys("pawar");
  		driver.findElement(By.id("postal-code")).sendKeys("431517");
  		Thread.sleep(2000);
  		driver.findElement(By.id("continue")).click();
  		String expectedpage_url="https://www.saucedemo.com/checkout-step-two.html";
  		String actual_url=driver.getCurrentUrl();
  		Assert.assertEquals(actual_url, expectedpage_url, " first name is not accepting numbers error message is showing");
  		System.out.println("First name is accepting numbers error message is not showing ");
  		driver.close();
  		}
 /* 	@Test()
  	void first_name_validation()
  	
  	{
  		String actual_m=driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")).getText();
  		
  		String expected_m="Error: First Name is required";
  		
  		Assert.assertEquals(actual_m, expected_m, "Test fail first name is accepting the numbers also");
  		System.out.println("TEst pass Error message is showing after entering numbers in first name field");
  		driver.close();
  	
  	
  	}*/
  	//3.Last name is accepting the numbers or not 
  		@Test(priority=4)
  		void last_name() throws InterruptedException 
  		{
  			driver.findElement(By.id("user-name")).sendKeys("standard_user");
  	  	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  	  	  driver.findElement(By.id("login-button")).click();
  	  		  Thread.sleep(2000);
  	  		  driver.findElement(By.className("shopping_cart_link")).click();
  	  		  driver.findElement(By.id("checkout")).click();
  	  		driver.findElement(By.id("first-name")).sendKeys("pruthviraj");
  	  		driver.findElement(By.id("last-name")).sendKeys("123456");
  	  		driver.findElement(By.id("postal-code")).sendKeys("431517");
  	  		Thread.sleep(2000);
  	  		driver.findElement(By.id("continue")).click();
  	  		String expectedpage_url="https://www.saucedemo.com/checkout-step-two.html";
  	  		String actual_url=driver.getCurrentUrl();
  	  		Assert.assertEquals(actual_url, expectedpage_url, " last name is not accepting numbers error message is showing");
  	  		System.out.println("last name is accepting numbers error message is not showing ");
  	  		driver.close();
  			
  		}
  		//4. verify zip_code is accepting special characters or not
  			@Test(priority=5)
  			void postal_code() throws InterruptedException
  			{
  				driver.findElement(By.id("user-name")).sendKeys("standard_user");
  	  	  	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  	  	  	  driver.findElement(By.id("login-button")).click();
  	  	  		  Thread.sleep(2000);
  	  	  		  driver.findElement(By.className("shopping_cart_link")).click();
  	  	  		  driver.findElement(By.id("checkout")).click();
  	  	  		driver.findElement(By.id("first-name")).sendKeys("pruthviraj");
  	  	  		driver.findElement(By.id("last-name")).sendKeys("pawar");
  	  	  		driver.findElement(By.id("postal-code")).sendKeys("@#$%!");
  	  	  		Thread.sleep(2000);
  	  	  		driver.findElement(By.id("continue")).click();
  	  	  		String expectedpage_url="https://www.saucedemo.com/checkout-step-two.html";
  	  	  		String actual_url=driver.getCurrentUrl();
  	  	  		Assert.assertEquals(actual_url, expectedpage_url, " ZIP_CODE is not accepting Special characters error message is showing");
  	  	  		System.out.println("ZIP_CODE is accepting Special chracters error message is not showing ");
  	  	  		driver.close();
  			}
}



