package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URl of the application
		driver.get("https://www.facebook.com/");
		//find the element
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.name("login"));
		//get the text of the webelement
		Thread.sleep(3000);	
		String tagText = loginButton.getText();
		//Print the text
		System.out.println("tagText : "+tagText);
		//Post condition
		driver.quit();
	}
}
