package Selenium_tasks.Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Positive_test_case_swaglabs {
  EdgeDriver driver;
	
	@Test
  public void f() {
		
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	//  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	 
	}  
	
	//validating is item present in the cart or not
  
	@Test(dependsOnMethods="f")
	void validate() throws InterruptedException
	{
		//check add item is available in cart or not
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();	
		WebElement text= driver.findElement(By.xpath("//div[@class='inventory_item_name']"));  
	        String expectedItem = "Sauce Labs Backpack";
	        String actualItem = text.getText();     		
	        Assert.assertEquals("Item is not available incart cart is empty", expectedItem, actualItem);
	        System.out.println(actualItem);
		
	    
	        //click on continue button and check your going on inventory page for shopping
	        Thread.sleep(2000);
		driver.findElement(By.id("continue-shopping")).click();
		String expected_urlD="https://www.saucedemo.com/inventory.html";
		String actual_urlD=driver.getCurrentUrl();
		Assert.assertEquals(actual_urlD, expected_urlD);
		System.out.println(actual_urlD);
	
		
		//now add all item  in cart
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	//		driver.findElement(By.className("shopping_cart_link")).click();
		
		}
	
	//NOW CHECK ALL THE ADDED ITEM ARE ADDDED IN CART OR NOT
	
	@Test(dependsOnMethods="validate")
	void validating_all_Item() throws InterruptedException
	{
		//1.sauce labs backpack
		
		driver.findElement(By.className("shopping_cart_link")).click();
		WebElement bag=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String expected_item1="Sauce Labs Backpack";
		String actual_item1=bag.getText();
		Assert.assertEquals("item not found.1", expected_item1, actual_item1);
		System.out.println(actual_item1);
		
		//2.Sauce Labs Bike Light
		
		
		WebElement light=driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
		String expected_item2="Sauce Labs Bike Light";
		String actual_item2= light.getText();
		Assert.assertEquals("item not found.2", expected_item2, actual_item2);
		System.out.println(actual_item2);
		
		//3.Sauce Labs Bolt T-Shirt
		
		WebElement Tshirt=driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
		String expected_item3="Sauce Labs Bolt T-Shirt";
		String actual_item3=Tshirt.getText();
		Assert.assertEquals("item not found.3", expected_item3, actual_item3);
		System.out.println(actual_item3);
		
		//4.Sauce Labs Fleece Jacket
		
		WebElement jacket=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		String expected_i1="Sauce Labs Fleece Jacket";
		String actual_i1=jacket.getText();
		Assert.assertEquals("item not found.4", expected_i1, actual_i1);
		System.out.println(actual_i1);
		
		//5.Sauce Labs Onesie
		
		WebElement onesie=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		String expected_one1="Sauce Labs Onesie";
		String actual_one1=onesie.getText();
		Assert.assertEquals("Item not found.5", expected_one1, actual_one1);
		System.out.println(actual_one1);
		
		//6.Test.allTheThings() T-Shirt (Red)
		
		WebElement Red=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
		String expected_red1="Test.allTheThings() T-Shirt (Red)";
		String actual_red2=Red.getText();
		Assert.assertEquals("ITEM NOT FOUND.6", expected_red1, actual_red2);
		System.out.println(actual_red2);
	
		//Item count 	
		
		WebElement count=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		String Exp_Count="6";
		String Actu_Count=count.getText();
		Assert.assertEquals("count mismatch", Exp_Count, Actu_Count);
		System.out.println(Actu_Count);

		//item removed 
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		System.out.println("Backpack removed");
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		System.out.println("bike light removed");
		
		//Removed item count validation
		
		WebElement count1=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		String EXP_count1="4";
		String ACTU_count1=count1.getText();
		Assert.assertEquals("Items are not removed", EXP_count1, ACTU_count1);
		System.out.println(ACTU_count1);
		System.out.println("Items removed succesfully");

		
	}
		@Test(dependsOnMethods="validating_all_Item")
		void Checkouts() throws InterruptedException 
		{
			Thread.sleep(2000);
			driver.findElement(By.id("checkout")).click();
			driver.findElement(By.id("first-name")).sendKeys("Pruthviraj");
			driver.findElement(By.id("last-name")).sendKeys("pawar");
			driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("411519");
			
			//click on cancle and check is it comming to cart or not
			Thread.sleep(2000);
			driver.findElement(By.id("cancel")).click();
			String cartexpected_url="https://www.saucedemo.com/cart.html";
			String cartactual_url=driver.getCurrentUrl();
			Assert.assertEquals("opration failed not goinig on cart", cartexpected_url, cartactual_url);
			System.out.println("Successfully backward to cart page");
			
			//again go to checkout and click continue
			Thread.sleep(2000);
			driver.findElement(By.id("checkout")).click();
			driver.findElement(By.id("first-name")).sendKeys("Pruthviraj");
			driver.findElement(By.id("last-name")).sendKeys("pawar");
			driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("411519");
			driver.findElement(By.id("continue")).click();
		
		//Reciept validation	
			Thread.sleep(2000);
			WebElement Recipttext=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]"));
			String Expectedtext="Payment Information:";
			String actualtext=Recipttext.getText();
			Thread.sleep(2000);
			Assert.assertEquals("Payment receipt not genrated", Expectedtext, actualtext);
			System.out.println(actualtext);
			
			//click on cancle and check you are on dashboard or home page 
			Thread.sleep(2000);
			driver.findElement(By.id("cancel")).click();
			String expectedH_url="https://www.saucedemo.com/inventory.html";
			String actualH_url=driver.getCurrentUrl();
			Thread.sleep(2000);
			Assert.assertEquals("unable to cancle error found", expectedH_url, actualH_url);
			System.out.println("SwagLabs Home page Successfully reached");
					
			Thread.sleep(2000);
			driver.findElement(By.ByXPath.className("shopping_cart_link")).click();
			driver.findElement(By.id("checkout")).click();
			driver.findElement(By.id("first-name")).sendKeys("Pruthviraj");
			driver.findElement(By.id("last-name")).sendKeys("pawar");
			driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("411519");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("finish")).click();
			//check it should display Thank you message 
			Thread.sleep(2000);
			WebElement pagetext=driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
			String expectedtext="Thank you for your order!";
			String actualtext2=pagetext.getText();
			Thread.sleep(2000);
			Assert.assertEquals("Message is not showing", expectedtext, actualtext2);
			System.out.println(actualtext2);
			
			
			//validate we are on home page or not by clicking on back home button 
			Thread.sleep(2000);
			driver.findElement(By.id("back-to-products")).click();
			String expectedhomeurl="https://www.saucedemo.com/inventory.html";
			String actualhomeurl=driver.getCurrentUrl();
			Assert.assertEquals(null, expectedhomeurl, actualhomeurl);
			System.out.println("Successfully comback to home page of Swaglabs");
			
			//now logout
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			System.out.println("Successfully loggedout from SwagLabs");
			Thread.sleep(2000);
			driver.close();
		
			
			
		}
	
	


}
	 
	
		
		
	

