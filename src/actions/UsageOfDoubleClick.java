package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfDoubleClick {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		//to perform double click on  the webpage using doubleClick()
		int ht=80;
		int wid=204;
		actions.moveByOffset(ht, wid).doubleClick().perform();
		Thread.sleep(4000);
		//to perform double click on  the webpage using doubleClick(WebElement)
		//identify target webelement
		WebElement alert = driver.findElement(By.xpath("//div[.=\"Alerts, Frame & Windows\"]/span"));
		alert.click();
		actions.doubleClick(alert).perform();
		Thread.sleep(4000);
		driver.quit();
	}
}
