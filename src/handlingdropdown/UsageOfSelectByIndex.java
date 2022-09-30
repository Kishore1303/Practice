package handlingdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfSelectByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		WebElement monthDrowDown = driver.findElement(By.id("month"));
		Select selectMonth=new Select(monthDrowDown);
		selectMonth.selectByIndex(5);
		List<WebElement> allMonthDropDown = selectMonth.getOptions();
		for (WebElement month : allMonthDropDown) {
			if(month.isSelected()) {
			System.out.println("Pass "+month.getTagName()+" is selected");
			break;
			}
		}
		driver.quit();
	}
}
