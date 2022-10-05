package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsgaeOfMoveToElementCoordinates {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://phptravels.com/demo/");
		WebElement login=driver.findElement(By.linkText("Login"));
		int height = login.getSize().getHeight();
		int width = login.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		int ht=(height*40)/100;
		int wd=(width*50)/100;
		//create the Actions class object
		Actions actions=new Actions(driver);
		actions.moveToElement(login, wd, ht).click().perform();
		Thread.sleep(8000);
		driver.quit();
	}
}
