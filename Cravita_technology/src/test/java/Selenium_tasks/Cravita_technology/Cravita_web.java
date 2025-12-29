package Selenium_tasks.Cravita_technology;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jdk.internal.org.objectweb.asm.Handle;
import junit.framework.Assert;

public class Cravita_web {
	
	
	EdgeDriver driver=new EdgeDriver();
	
  @Test(priority=1)
  public void website_launch() {
	  
	  //check website launches succesfully 
	driver.get("https://www.cravitaindia.com/");
	
  }
  
  
  @Test(priority=2)
  	void our_work_button() throws InterruptedException {
	//verify functionality of our work button 	///
	WebElement name=driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[4]/a"));  ///////////
	name.getText();
	String expected_name=name.getText();
	String actual_name=name.getText();
	Assert.assertEquals(expected_name, actual_name);     //message is entered error is showing 
	System.out.println("NAME IS MATCHHING:-"+name.getText());
	name.click();
	
	// contact us button in our work page 
	WebElement name1=driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/a"));  ///////////
	name1.getText();
	String expected_name1=name1.getText();
	String actual_name1=name1.getText();
	Assert.assertEquals(expected_name1, actual_name1);     //message is entered error is showing 
	System.out.println("NAME IS MATCHHING:-"+name1.getText());
	name1.click();
	 Thread.sleep(2000); 
  	}
	
  @Test(priority=3)
	void CARRER_BUTTON() throws InterruptedException {
	WebElement Carrer=driver.findElement(By.cssSelector("body > div.header > div > nav > ul > li:nth-child(5) > a"));  ///////////
	Carrer.getText();
	String expected_Carrer=Carrer.getText();
		String actual_Carrer=Carrer.getText();
		Assert.assertEquals(expected_Carrer, actual_Carrer);     //message is entered error is showing 
		System.out.println("NAME IS MATCHHING:-"+Carrer.getText());
		Carrer.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingOne\"]/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingFour\"]/h4/a")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[@id=\"headingFive\"]/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingSix\"]/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"headingSeven\"]/h4/a")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/center/div/a/img")).click();
//		Thread.sleep(2000);
//		driver.get("https://www.cravitaindia.com/career/");
//		driver.findElement(By.id("name")).sendKeys("plp");
	
		
	//	driver.findElement(By.id("email")).sendKeys("plp@123");
		//driver.findElement(By.id("phone")).sendKeys("9834702536");
		//driver.findElement(By.id("altphone")).sendKeys("9834702536");
		//driver.findElement(By.id("Qualification")).click();
		//Select qualification=new Select(driver.findElement(By.id("Qualification"))); 
		//qualification.selectByValue("BE/B.tech");
		
  }
  
  @Test(priority=4)
	
	void CONTACT_US_BUTTON()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("body > div.header > div > nav > ul > li:nth-child(6) > a")).click();
		driver.findElement(By.id("fname")).sendKeys("Abhishek");
		driver.findElement(By.id("email")).sendKeys("Alp123@gmail.com");
		driver.findElement(By.id("tele")).sendKeys("1234567890");
		driver.findElement(By.id("subject")).sendKeys("hello");
		driver.findElement(By.id("submit")).click();
		driver.navigate().back();
	}
  
  
  
  @Test
  	void Carrer_form() {
	  
//	  1. verify career link functionality.
//	  2.verify career page should be visible to user.
//	  3.verify page should show the proper details.
//	  4.verify that page should scorll as per user need.
//	  5.verify the functionality of "apply" button.
//	  6."your name" field should expect only alphabetic characters.
//	  7."Phone" field should accept only numeric characters.
//	  8.verify that submit button functionality.
//	  10.verify the functionality of droppbox.
//	  11.verify the functionality of choose file.
//	  12."message" field should accept alphanumeric characters. 
//	  13.Email field should not accept charaters  after .com
//	  14.verify that all the position button functionality. 
  	//	driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.cravitaindia.com/career/");
		driver.findElement(By.id("name")).sendKeys("Abhishek");
		driver.findElement(By.id("email")).sendKeys("Alp123@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1233456789");
		driver.findElement(By.id("altphone")).sendKeys("1234567899");		
		Select qualaction =new Select(driver.findElement(By.id("Qualification")));
		qualaction.selectByValue("BE/B.tech");
		Select stream=new Select(driver.findElement(By.id("Stream")));
		stream.selectByValue("Mechanical");
		Select year=new Select(driver.findElement(By.id("Passing")));
		year.selectByValue("2023");
		Select Work_experiance=new Select(driver.findElement(By.id("Experience")));
		Work_experiance.selectByValue("Freshers");
		driver.findElement(By.id("message")).sendKeys("HEllo");
		WebElement picture=driver.findElement(By.id("image"));
		picture.sendKeys("C:\\Users\\ASUS\\OneDrive\\Pictures");
		System.out.println(picture.getScreenshotAs(OutputType.FILE));
		driver.findElement(By.className("button-primary")).click();
	//	driver.close();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
  	}
  	@Test(priority=5)
  	void Quick_link() throws InterruptedException
  	{
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[1]/a")).click();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[2]/a")).click();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[3]/a")).click();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[4]/a")).click();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[6]/a")).click();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[7]/a")).click();
  			Thread.sleep(2000);
  								
  	}
  		@Test(priority=6)
  	public	void Linkdle_icon()
  		{
  			
  			WebElement linkdl=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div/div[2]/a[1]/i"));
  			linkdl.click();
  			
  					
  		}
  		
  	
  }
  
  

