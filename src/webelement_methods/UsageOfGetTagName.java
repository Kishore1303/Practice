package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//find the element
		WebElement signInButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		//find the tagName by using getTagName()
		String tagName = signInButton.getTagName();
		System.out.println("TagName : "+tagName);
		//Post condition
		driver.quit();
	}
}
