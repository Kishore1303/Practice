package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] agrs) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//Find the element
		Thread.sleep(5000);
		WebElement signInButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		//using getSize() find the  size of the element
		Dimension buttonSize = signInButton.getSize();
		System.out.println("Height : "+buttonSize.getHeight());
		System.out.println("Width  : "+buttonSize.getWidth());
		//Post condition
		driver.quit();
	}
}
