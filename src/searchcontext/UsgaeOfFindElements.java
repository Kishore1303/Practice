package searchcontext;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsgaeOfFindElements {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre condition
		//maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		//find elements
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		//to count the number of images in webpage
		int count=0;
		//iterate using for each loop
		for (WebElement img : images) {
			System.out.println(count++);
		}
		//Post condition
		driver.quit();
	}
}
