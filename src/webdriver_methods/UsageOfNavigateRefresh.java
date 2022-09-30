package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateRefresh {
	public static void main(String[] args) throws Throwable {
		//Set the driver exxecutable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URl of the application
		driver.get("https://nxtgenaiacademy.com/");
		//Post condition
		Thread.sleep(2000);
		//Refresh webpage
		if(driver.getCurrentUrl().equals("https://nxtgenaiacademy.com/")) {
			driver.navigate().refresh();
			System.out.println("Pass");
		}
		//Post condition
		driver.quit();
	}
}
