package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateToStringUrl {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-conditon
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://nxtgenaiacademy.com/");
		Thread.sleep(2000);
		//Navigate to sub page of application
		driver.navigate().to("https://nxtgenaiacademy.com/python/");
		//Post condition
		Thread.sleep(2000);
		driver.quit();
	}
}
