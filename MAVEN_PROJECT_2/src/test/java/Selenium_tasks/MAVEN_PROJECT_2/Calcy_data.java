package Selenium_tasks.MAVEN_PROJECT_2;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Calcy_data {
	
	
  @Test(dataProvider = "financial_calculator")
  public void fanancial_calculators( String s ) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.calculator.net/");
        driver.findElement(By.linkText(s)).click();
    //    WebElement heading = driver.findElement(By.xpath("//h1"));

      //  String actual = heading.getText().trim();
	//  WebElement link=driver.findElement(By.xpath(A));
	//  link.getText();
	//  String expected_URL=URL.getAccessibleName();
	//  String actual_URL=URL.getAccessibleName();
	//  Assert.assertEquals( actual,expectedHeading, "TEXT IS NOT MATCHING"+heading.getText());
	  System.out.println("Link is valid:-"+driver.getTitle());
	  driver.navigate().back();
	  driver.close();
  }

  @DataProvider
  public Object[][] financial_calculator() {
    return new Object[][] {
      new Object[] {  "Financial Calculators" },
      new Object[] {  "Mortgage Calculator"},
      new Object[] {  "Loan Calculator"},
      new Object[] {  "Auto Loan Calculator"},
      new Object[] {  "Interest Calculator"},
      new Object[] {  "Payment Calculator"},
      new Object[] {  "Retirement Calculator"},
      new Object[] {  "Amortization Calculator"},
      new Object[] {  "Investment Calculator"},
      new Object[] {  "Inflation Calculator"},
      new Object[] {  "Finance Calculator"},
      new Object[] {  "Income Tax Calculator"},
      new Object[] {  "Compound Interest Calculator"},
      new Object[] {  "Salary Calculator"},
      new Object[] {  "Interest Rate Calculator"},
      new Object[] {  "Sales Tax Calculator"},
         
      
    };
  }

  @Test(dataProvider = "Fitness_Health_Calculators")
  public void Fitness_Health_Calculators( String c ) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.calculator.net/");
        driver.findElement(By.linkText(c)).click();
        System.out.println("Link is valid:-"+driver.getTitle());
        driver.navigate().back();
        driver.close();
        
  }     
        
   @DataProvider
   public Object[][] Fitness_Health_Calculators() {
	    return new Object[][] {
	      new Object[] {  "Fitness & Health Calculators" },
	      new Object[] {  "BMI Calculator" },
	      new Object[] {  "Calorie Calculator" },
	      new Object[] {  "Body Fat Calculator" },
	      new Object[] {  "BMR Calculator" },
	      new Object[] {  "Ideal Weight Calculator" },
	      new Object[] {  "Pace Calculator" },
	      new Object[] {  "Pregnancy Calculator" },
	      new Object[] {  "Pregnancy Conception Calculator" },
	      new Object[] {  "Due Date Calculator" },
	   

	      
	    };
   }


   
   @Test(dataProvider = "Math_Calculators")
   public void Math_Calculators( String b ) {
 	  ChromeDriver driver=new ChromeDriver();
 	  driver.get("https://www.calculator.net/");
         driver.findElement(By.linkText(b)).click();
         System.out.println("Link is valid:-"+driver.getTitle());
         driver.navigate().back();
         driver.close();
         
   }     
         
    @DataProvider
    public Object[][] Math_Calculators() {
 	    return new Object[][] {
 	      new Object[] {  "Scientific Calculator" },
 	      new Object[] {  "Fraction Calculator" },
 	      new Object[] {  "Math Calculators" },
 	      new Object[] {  "Percentage Calculator" },
 	      new Object[] {  "Random Number Generator" },
 	      new Object[] {  "Triangle Calculator" },
 	      new Object[] {  "Standard Deviation Calculator" },
 	      
 	    };
    }
   
   
    @Test(dataProvider = "Other_Calculators")
    public void Other_Calculators( String D ) {
  	  ChromeDriver driver=new ChromeDriver();
  	  driver.get("https://www.calculator.net/");
          driver.findElement(By.linkText(D)).click();
          System.out.println("Link is valid:-"+driver.getTitle());
          driver.navigate().back();
          driver.close();
          
    }     
          
     @DataProvider
     public Object[][] Other_Calculators() {
  	    return new Object[][] {
  	      new Object[] {  "Age Calculator" },
  	      new Object[] {  "Date Calculator" },
  	      new Object[] {  "Other Calculators" },
  	      new Object[] {  "Time Calculator" },
  	      new Object[] {  "Hours Calculator" },
  	      new Object[] {  "GPA Calculator" },
  	      new Object[] {  "Grade Calculator" },
  	    new Object[] {  "Concrete Calculator" },
  	  new Object[] {  "Concrete Calculator" },
  	new Object[] {  "Subnet Calculator" },
  	new Object[] {  "Password Generator" },
  	new Object[] {  "Conversion Calculator" },
  	    };
     }
    
    
    @Test
    void allcalculator() {
    	 ChromeDriver driver=new ChromeDriver();
   	  driver.get("https://www.calculator.net/");
           driver.findElement(By.xpath("//*[@id=\"contentout\"]/div[2]/a/img")).click();
           System.out.println("Link is valid:-"+driver.getTitle());
           driver.navigate().back();
           driver.close();
    	
    }
   
}
