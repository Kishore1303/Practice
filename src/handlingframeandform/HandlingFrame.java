package handlingframeandform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrame {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre condition
		//maximize
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//infinite time to wait
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		//Pass the main URL of the application
		driver.get("https://demoqa.com/frames");
		//find the element
		//NoSuchElementException if the target element within frame
		//transferring driver control to frame
		WebElement targetElement = driver.switchTo().frame(4).findElement(By.id("sampleHeading"));
		System.out.println(targetElement.getText());
		//transferring driver control to back to default content area
		driver.switchTo().parentFrame();
		String Text = driver.findElement(By.xpath("//div[.='Elements']")).getText();
		System.out.println(Text);
		//Post condition
		driver.quit();
	}
}
