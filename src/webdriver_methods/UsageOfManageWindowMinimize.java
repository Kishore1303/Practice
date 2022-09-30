package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageWindowMinimize {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Precondition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//Minize the browser window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		//Post condition
		driver.quit();
		
	}
}
