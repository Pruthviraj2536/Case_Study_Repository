package Selenium_tasks.Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Footer_feature_test_swaglab {
	EdgeDriver driver=new EdgeDriver();
	@BeforeSuite 
	public void Login() 
	  {
		  
		  driver.navigate().to("https://www.saucedemo.com/");
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  	  driver.findElement(By.id("login-button")).click();

	  }
	  
/*	  @Test
	   void Footer_link_validation() throws InterruptedException
	  {
	  
	  		//Twitter link icon 
	  
		  String mainWindow = driver.getWindowHandle();
		  WebElement link=driver.findElement(By.linkText("Twitter"));
		  link.click();
		  
		  String expected_URLOFTWITER="Twitter";			//where to find do not know but i picked up  from console when error was found then i pasted here 
		  String actual_URLOFTWITER=link.getText();
		  Assert.assertEquals(actual_URLOFTWITER, expected_URLOFTWITER, "Twittter link not found test failed");
		  System.out.println("Test passed Twitter link found:"+actual_URLOFTWITER);
		  Thread.sleep(2000);
		  
		  driver.switchTo().window(mainWindow);
		  
		  //Facebook link icon
		  
		  WebElement link1=driver.findElement(By.linkText("Facebook"));
		  link1.click();
		  
		  String expected_URLOF_FB="Facebook";			//where to find do not know but i picked up  from console when error was found then i pasted here 
		  String actual_URLOF_FB=link1.getText();
		  Assert.assertEquals(actual_URLOF_FB, expected_URLOF_FB, "FB link not found test failed");
		  System.out.println("Test passed FB link found:"+actual_URLOF_FB);
		  Thread.sleep(2000);
		  
		  driver.switchTo().window(mainWindow);
		  
		  //Linkdle link icon 
		  
		  WebElement link2=driver.findElement(By.linkText("LinkedIn"));
		  link2.click();
		  
		  String expected_URLOF_Linkdle="LinkedIn";			//where to find do not know but i picked up  from console when error was found then i pasted here 
		  String actual_URLOF_Linkdle=link2.getText();
		  Assert.assertEquals(actual_URLOF_Linkdle, expected_URLOF_Linkdle, "Linkdle link not found test failed");
		  System.out.println("Test passed Linkdle link found:"+actual_URLOF_Linkdle);
		  Thread.sleep(2000);
		  
		  driver.switchTo().window(mainWindow);
		  
		  
	  }*/
	@Test(priority=1)
		void Twiter() throws InterruptedException
	{
		 WebElement link=driver.findElement(By.linkText("Twitter"));
		  link.click();
		  
		  String expected_URLOFTWITER="Twitter";			//where to find do not know but i picked up  from console when error was found then i pasted here 
		  String actual_URLOFTWITER=link.getText();
		  Assert.assertEquals(actual_URLOFTWITER, expected_URLOFTWITER, "Twittter link not found test failed");
		  System.out.println("Test passed Twitter link found:"+actual_URLOFTWITER);
		  Thread.sleep(2000);
		  
		
		
	}
	@Test(priority=2)
	void Facebook() throws InterruptedException
	{
		
		 WebElement link1=driver.findElement(By.linkText("Facebook"));
		  link1.click();
		  
		  String expected_URLOF_FB="Facebook";			//where to find do not know but i picked up  from console when error was found then i pasted here 
		  String actual_URLOF_FB=link1.getText();
		  Assert.assertEquals(actual_URLOF_FB, expected_URLOF_FB, "FB link not found test failed");
		  System.out.println("Test passed FB link found:"+actual_URLOF_FB);
		  Thread.sleep(2000);
		  
		
		
	}
	@Test(priority=3)
	void Linkdle() throws InterruptedException
	{
		String mainwindow=driver.getWindowHandle();
		  WebElement link2=driver.findElement(By.linkText("LinkedIn"));
		  link2.click();
		  
		  String expected_URLOF_Linkdle="LinkedIn";			//where to find do not know but i picked up  from console when error was found then i pasted here 
		  String actual_URLOF_Linkdle=link2.getText();
		  Assert.assertEquals(actual_URLOF_Linkdle, expected_URLOF_Linkdle, "Linkdle link not found test failed");
		  System.out.println("Test passed Linkdle link found:"+actual_URLOF_Linkdle);
		  Thread.sleep(2000);
		  driver.switchTo().window(mainwindow);
		  
		  
	}
	@Test(priority=4)
	void feature() throws InterruptedException
	{
		
		//String mainwindow=driver.getWindowHandle();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	driver.switchTo().window(mainwindow);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.quit();
		
	}
	
}