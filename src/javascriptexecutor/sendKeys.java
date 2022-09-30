package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sendKeys {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pre condition
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//find element
		WebElement emailTF = driver.findElement(By.id("email"));
		//downcast the webdriver driver referrence to JavaScriptExecutor interafce
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//we can send data  by 2 ways
		//call the executteScript() and append the data
		//jse.executeScript("document.getElementById(\"email\").value=\"Kishore\";");
		//OR
		jse.executeScript("arguments[0].value='Kishore'", emailTF);
		Thread.sleep(3000);
		//Post condition
		driver.quit();
	}
}
