package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		//Find the element 
		WebElement searchButton = driver.findElement(By.xpath("(//*[@class='icon icon-search'])[1]"));
		Thread.sleep(2000);
		//Click on target element
		searchButton.click();
		Thread.sleep(2000);
		//Post condition
		driver.quit();
	}
}
