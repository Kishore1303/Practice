package handlingdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfSelectByVisibleTextAndGetOptions {
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
		//to verify day dropdown
		//identify the target dropdown listbox
		WebElement dayDropDown = driver.findElement(By.id("day"));
		//Create the select class
		Select daySelect=new Select(dayDropDown);
		List<WebElement> allDayOption = daySelect.getOptions();
		for (WebElement day : allDayOption) {
			String visibleText = day.getText();
			daySelect.selectByVisibleText(visibleText);
			if(day.isSelected()) {
				System.out.println("Pass : "+visibleText+" is selected");
			}else
				System.out.println("Fail : "+visibleText+"is not selected");
		}
		//to verify month dropdown
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select selectMonth=new Select(monthDropDown);
		List<WebElement> allMonthOptions = selectMonth.getOptions();
		for (WebElement month : allMonthOptions) {
			String visibleMonthText = month.getText();
			selectMonth.selectByVisibleText(visibleMonthText);
			if(month.isSelected()) {
				System.out.println("Pass : "+visibleMonthText+" is selected");
			}else
				System.out.println("Fail : "+visibleMonthText+"is not selected");
		}
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select selectYear=new Select(yearDropDown);
		List<WebElement> allYearOptions = selectYear.getOptions();
		for (WebElement year : allYearOptions) {
			String visibleYearText = year.getText();
			selectYear.selectByVisibleText(visibleYearText);
			if(year.isSelected()) {
				System.out.println("Pass "+visibleYearText+" is selected");
			}else
				System.out.println("Fail "+visibleYearText+" is not selected");
		}
		//post condition
		driver.quit();
	}
}
