package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfContextClick {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://phptravels.com/demo/");
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		int width=(int)jse.executeScript("return document.body.scrollWidth");
//		int height=(int)jse.executeScript("return document.body.scrollHeight");
		int wid=950;
		int ht=70;
		Actions actions=new Actions(driver);
		//to perform right click on webpage using contestClick()
		actions.moveByOffset(wid, ht).contextClick().perform();
		Thread.sleep(4000);
		//to perform right click on target WebElement
		//identify the target WebElement
		WebElement login = driver.findElement(By.linkText("Login"));
		//Perform right click using contextClick(webelement)
		actions.contextClick(login).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
