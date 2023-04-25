package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
	
  
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();  
  }

@Test
public void twitter() {
	driver.get("https://www.twitter.com");

}
@Test
public void Facebook() {
	driver.get("https://www.Facebook.com");

}
@Test
public void selenium() {
	driver.get("https://www.selenium.dev");
}

}
