package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Precondition
		driver.manage().window().maximize();
		//Pass main URL of the application
		driver.get("https://www.facebook.com/");
		String expectedUrl = "https://www.facebook.com/";
		//Get the current URL
		String actualUrl = driver.getCurrentUrl();
		//To verify the URL
		if(expectedUrl.contains(actualUrl)) {
			System.out.println("Pass : The URL of the FB is validated and correct");
		}else
			System.out.println("Fail : The URL of the FB is incorrect");
		//Post condition
		driver.quit();
	}
}
