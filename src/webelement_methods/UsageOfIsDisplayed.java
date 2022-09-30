package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		Thread.sleep(5000);
		driver.get("https://www.dassault-aviation.com/en/");
		//find the element
		WebElement mediaButton = driver.findElement(By.xpath("//*[@class='icon icon-media']"));
		//check the media button is present and displayed on 
		//browser using isDisplayed()
		Thread.sleep(3000);
		if(mediaButton.isDisplayed()) {
			System.out.println("Pass : The media button is present and displayed");
		}else
			System.out.println("Fail : The media button is present and not displayed");
		//Post condition
		driver.quit();
	}
}
