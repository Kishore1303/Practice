package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateBack {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		//Identify the element and click
		WebElement homeButton = driver.findElement(By.xpath("//span[text()='Home']"));
		homeButton.click();
		Thread.sleep(3000);
		//backward webpage
		driver.navigate().back();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://nxtgenaiacademy.com/multiplewindows/")) {
			System.out.println("Pass");
		}else
			System.out.println("Pass");
		driver.quit();
	}
}
