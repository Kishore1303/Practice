package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfKeyDownAndKeyUp {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//to  perform keyDown and keyUp
		Actions actions=new Actions(driver);
		WebElement login = driver.findElement(By.name("login"));
		actions.keyDown(Keys.CONTROL).contextClick(login).keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
