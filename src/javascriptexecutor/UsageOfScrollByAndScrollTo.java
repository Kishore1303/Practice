package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfScrollByAndScrollTo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//Downcast drive to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1200);");
		Thread.sleep(3000);
		//to scroll from O(zero)position to 1400 pixels down
		jse.executeScript("window.scrollTo(0, 1400);");
		Thread.sleep(3000);
		//to scroll from current position to 1300 pixels down
		jse.executeScript("window.scrollBy(0,1300);");
		Thread.sleep(3000);
		driver.quit();
	}
}
