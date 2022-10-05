package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsgaeOfMoveByOffset {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://phptravels.com/demo/");
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		int startX=loginLink.getLocation().getX();
		int startY=loginLink.getLocation().getY();
		Actions actions=new Actions(driver);
		actions.moveByOffset(startX, startY).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
