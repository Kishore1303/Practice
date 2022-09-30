package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetWindowHandle {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//Get the current window id
		String currentWindowId=driver.getWindowHandle();
		System.out.println(currentWindowId);
		//Compare the window id
		if(currentWindowId.contains(currentWindowId)) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
		//Post condition
		driver.quit();
	}
}
