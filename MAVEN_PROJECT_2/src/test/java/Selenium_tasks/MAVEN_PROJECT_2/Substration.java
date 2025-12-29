package Selenium_tasks.MAVEN_PROJECT_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Substration extends Addition{
	
	@Test
	public void subtraction() {
		
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	}

}
