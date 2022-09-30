package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		// driver.findElement(By.name("login"));
		// DOWNCASTING OF DRIVER INTO JAVASCRIPT
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"loginButton\").click();");
	}
}
