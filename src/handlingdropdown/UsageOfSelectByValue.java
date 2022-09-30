package handlingdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfSelectByValue {
	public static void main(String[] args) {
		//set the driver executable path
				System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
				//Instantiate the browser specific class
				WebDriver driver = new ChromeDriver();
				//Pre-condition
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//explicit wait
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				//Pass the main URL of the application
				driver.get("https://www.facebook.com/signup");
				//identify the target dropdown
				WebElement monthDropDown = driver.findElement(By.id("month"));
				//create the select object and pass monthDropDown as an argument
				Select selectMonth=new Select(monthDropDown);
				selectMonth.selectByValue("3");
				List<WebElement> allMonthOptions = selectMonth.getOptions();
				for (WebElement month : allMonthOptions) {
					if(month.isSelected()) {
						System.out.println("Pass : March is selected");
						break;
					}
				}
				//Post condition
				driver.quit();
	}
}
