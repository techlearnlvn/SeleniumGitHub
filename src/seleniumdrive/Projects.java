package seleniumdrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projects {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.close();
				
		
		
		
		

	}

}
