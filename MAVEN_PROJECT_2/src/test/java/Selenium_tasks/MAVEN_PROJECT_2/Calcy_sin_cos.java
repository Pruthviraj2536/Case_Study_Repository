package Selenium_tasks.MAVEN_PROJECT_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Calcy_sin_cos {
	
	ChromeDriver driver;
  @Test(dataProvider="button_validation")
  public void button_validation(String B) {
	
	  
	  driver=new ChromeDriver();
	  driver.get("https://www.calculator.net/");
	  driver.manage().window().maximize();
	  
	
	  
	  WebElement Screenvalue =driver.findElement(By.xpath(B));
	  
	  Screenvalue.click();
	  
	  System.out.println("button pressed:-"+Screenvalue.getText());
	  	  
	  	driver.close();		
  
  }  
  

@DataProvider
public Object[][] button_validation()
{
	return  new Object [][] {
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[1]/span[1]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[1]/span[2]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[1]/span[3]" },
			 new Object[] {"//*[@id=\"scirdsettingd\"]" },
			 new Object[] {"//*[@id=\"scirdsettingr\"]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[2]/span[1]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[2]/span[2]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[2]/span[3]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[2]/span[4]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[2]/span[5]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[3]/span[1]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[3]/span[2]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[3]/span[3]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[3]/span[4]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[3]/span[5]" },
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[4]/span[1]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[4]/span[2]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[4]/span[3]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[4]/span[4]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[4]/span[5]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[5]/span[1]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[4]/span[2]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[5]/span[3]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[5]/span[4]"},
			 new Object[] {"//*[@id=\"homefunbtn\"]/div[5]/span[5]"},
			// new Object[] {"//*[@id=\"homefunbtn\"]/div[5]/span[1]"},
	};
	}

			
		
}


