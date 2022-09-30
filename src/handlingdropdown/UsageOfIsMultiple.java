package handlingdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfIsMultiple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select selectDay=new Select(dayDropDown);
		if(selectDay.isMultiple()) {
			System.out.println("Multi select Dropdown");
		}else
			System.out.println("Single select Dropdown");
		driver.quit();
	}
}
