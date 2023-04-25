package seleniumdemo;



import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestDemo {
static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

			@AfterAll
			static void tearDownAfterClass() throws Exception {
			//	driver.quit();
			}
			
			@Disabled   // Only for Junit 5
			@Test
			void selenium() {
				driver.get("https://www.selenium.dev");
			} 

			@Test
			void google() {
				driver.get("https://www.google.com");
			}
			

			@Test
			void redmine() {
				driver.get("https://www.redmine.org");
			}
			
			@Ignore   // Only for Junit 3 & 4
			@Test
			void facebook() {
				driver.get("https://www.facebook.com");
			}
		
		
	}


