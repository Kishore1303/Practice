package handlingdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfGetFirstSelectedOption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select selectMonth=new Select(monthDropDown);
		WebElement currentSelectedMonth = selectMonth.getFirstSelectedOption();
		System.out.println(currentSelectedMonth.getText());
		driver.quit();
	}
}
