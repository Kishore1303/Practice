package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the Main URL of the application
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//find the element
		WebElement submitButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		//click on element using submit()
		//JavaScriptException
		submitButton.submit();
		System.out.println("Successfully logged-in");
		//Post condition
		driver.quit();
	}
}
