package handlingframeandform;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTable {
	public static void main(String[] args) {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//Pass the main URL of the application
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		//find the table
		WebElement pointsTable = driver.findElement(By.cssSelector("table[class='table cb-srs-pnts']"));
		//identify the mumbai row
		List<WebElement> miData = pointsTable.findElements(By.xpath("//div[text()='Mumbai Indians']/ancestor::tr//td[contains(@class,'cb-srs-pnts-td')]"));
		//for each loop to iterate the data
		for (WebElement data : miData) {
			System.out.println(data.getText());
		}
		//post condition
		driver.quit();
	}
}
