package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementScreenShotUsingGetScreenShotAs {
	public static void main(String[] args) {
		//to capture system date and time
		LocalDateTime ltd = LocalDateTime.now();
		String timeStamp=ltd.toString().replace(":", "-");
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre condition
		//Maximiza the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//infinite time to load page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//pass the main URL of the application
		driver.get("https://www.facebook.com/");
		WebElement loginButton=driver.findElement(By.name("login"));
		//down cast the WebDriver driver to TakesScreenshot interface
		File tempFile=loginButton.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./errorShots/FBLoginPage"+timeStamp+".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		//Post condition
		driver.quit();
	}
}
