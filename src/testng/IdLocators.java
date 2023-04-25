package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IdLocators {
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  driver.get("http://hyderabadreport.com/user");
	  Thread.sleep(2000);
	  driver.findElement(By.name("name")).sendKeys("Lavanya");
	  Thread.sleep(3000);
	  driver.findElement(By.id("edit-pass")).sendKeys("karthikeya");
	  Thread.sleep(2000);
	  driver.findElement(By.className("form-submit")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
