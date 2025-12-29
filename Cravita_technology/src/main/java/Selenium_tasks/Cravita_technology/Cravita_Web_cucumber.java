package Selenium_tasks.Cravita_technology;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Cravita_Web_cucumber {

	EdgeDriver driver=new EdgeDriver();
	
	


@Given("cravita website should open successfully")
public void cravita_website_should_open_successfully() {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://www.cravitaindia.com/");
	
	
}

@And("click on  our_work button")
public void click_on_our_work_button() {
    // Write code here that turns the phrase above into concrete actions
	WebElement name=driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[4]/a"));  ///////////
	name.getText();
	String expected_name=name.getText();
	String actual_name=name.getText();
	Assert.assertEquals(expected_name, actual_name);     //message is entered error is showing 
	System.out.println("NAME IS MATCHHING:-"+name.getText());
	name.click();
	
	
}

@Then("page should get displayed_our_work")
public void page_should_get_displayed_our_work() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("our_work page is displaying");
}

@And("click on contact_us button")
public void click_on_contact_us_button() {
    // Write code here that turns the phrase above into concrete actions
  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.cssSelector("body > div.header > div > nav > ul > li:nth-child(6) > a")).click();
	
	
}

@Then("page should be display_contact_us")
public void page_should_get_displayed_contact_us() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("contactus page is displaying");
}

@And("clickk on carrier button")
public void clickk_on_carrier_button() {
    // Write code here that turns the phrase above into concrete actions
   
	WebElement Carrer=driver.findElement(By.cssSelector("body > div.header > div > nav > ul > li:nth-child(5) > a"));  ///////////
	Carrer.getText();
	String expected_Carrer=Carrer.getText();
		String actual_Carrer=Carrer.getText();
		Assert.assertEquals(expected_Carrer, actual_Carrer);     //message is entered error is showing 
		System.out.println("NAME IS MATCHHING:-"+Carrer.getText());
		Carrer.click();
	
	

}

@Then("page should be display_carrier")
public void page_should_get_displayed_carrier() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("carrier page is displaying");
}

//scenario 2

//@And("click on contact_us button")
//public void click_on_contact_us_button_1() {
//    // Write code here that turns the phrase above into concrete actions
//	
//	driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[6]/a")).click();
//}

@When("Fill details to each field")
public void fill_details_to_each_field() {
    // Write code here that turns the phrase above into concrete actions
//	driver.findElement(By.cssSelector("body > div.header > div > nav > ul > li:nth-child(6) > a")).click();
	driver.findElement(By.id("fname")).sendKeys("Abhishek");
	driver.findElement(By.id("email")).sendKeys("Alp123@gmail.com");
	driver.findElement(By.id("tele")).sendKeys("1234567890");
	driver.findElement(By.id("subject")).sendKeys("hello");

}

@And("click on submit button")
public void click_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("submit")).click();
	driver.navigate().back();
}

@Then("data should submitted succesfully")
public void data_should_submitted_succesfully() {
    // Write code here that turns the phrase above into concrete actions
   
	System.out.println("data submitted successfully");

}

//scenario 3

@And("click on apply button in carrier")
public void click_on_apply() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/center/div/a/img")).click();
	
}

@Then("page should display apply form")
public void page_should_display_apply_form() {
    // Write code here that turns the phrase above into concrete actions
   
	System.out.println("data submitted successfully");

}


	//scenario 3 Fill all the details in field and check it is acpeting or not

@When("Fill all details in each field")
public void Fill_carrier_form() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Abhishek");
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
	
	//driver.findElement(By.className("button-primary")).click();
	}

@And("click on submit button of form")
public void click_on_submit_button_form()
{
	driver.findElement(By.className("button-primary")).click();
}

@Then("form submitted succesfully message should apper")
public void print()
{
	
	
	System.out.println("s");
}


}
