package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfPageLoadTimeout {
	public static void main(String[] args) {
		//Set the driver edxecutable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre condition
		//Maximize the browser window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		System.out.println("Test Case Pass");
		//Post condition
		driver.quit();
	}
}
