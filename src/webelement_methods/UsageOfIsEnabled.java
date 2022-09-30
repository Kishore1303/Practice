package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//find the element
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.name("login"));
		Thread.sleep(4000);
		//check for element is enabled or not by using isEnabled()
		if(loginButton.isEnabled()) {
			loginButton.click();
			System.out.println("Pass : login button is Enabled");
		}else
		{
			System.out.println("Fail : login Button is disabled");
		}
		Thread.sleep(5000);
		//Post condition
		driver.quit();
	}
}
