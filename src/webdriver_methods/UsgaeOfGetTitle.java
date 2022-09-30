package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsgaeOfGetTitle {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the Main URL of the Application
		driver.get("https://www.facebook.com/");
		//Get the title of the webpage
		String titleFB = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		//Get the current Title of the webpage
		String actualTitle = driver.getTitle();
		if(expectedTitle.contains(actualTitle)) {
			System.out.println("PASS : The title of the facebook page is validated and correct");
		}else
			System.out.println("FAIL : The title of the facebook page is not correct");
		//post condition
		driver.quit();
	}
}
