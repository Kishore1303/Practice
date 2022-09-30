package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClearAndSendKeys {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//Find the element
		WebElement emailTextField = driver.findElement(By.id("email"));
		//clear the textfield using clear()
		emailTextField.clear();
		Thread.sleep(2000);
		//append the data using sendKeys()
		emailTextField.sendKeys("Kishore");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		//Post condition
		driver.quit();
	}
}
