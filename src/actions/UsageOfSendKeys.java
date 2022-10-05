package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfSendKeys {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		//to perform sendKeys() on the webpage
		Actions actions=new Actions(driver);
		//actions.sendKeys(Keys.ENTER).perform();
		//actions.sendKeys(Keys.PAGE_DOWN);
		//Thread.sleep(5000);
		////to perform sendKeys() on the webelement
		WebElement login = driver.findElement(By.name("login"));
		actions.sendKeys(login, Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
