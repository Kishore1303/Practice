package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//Get the Page source of the webpage
		String pageSource = driver.getPageSource();
		String createAccountButton = "Create New Account";
		//Verifying the Text
		if(pageSource.contains(createAccountButton)) {
			System.out.println("Pass :  The createAccountButton is found and correct");
		}else
			System.out.println("Fail :  The createAccountButton is not found");
		//post condition
		driver.quit();
	}
}
