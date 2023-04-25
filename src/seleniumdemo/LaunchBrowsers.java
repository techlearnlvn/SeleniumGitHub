package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();	
		
	}

}
