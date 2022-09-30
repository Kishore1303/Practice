package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenShotUsingGetScreenShotAs {
	public static void main(String[] args) {
		//to capture system date and time
		LocalDateTime ldt=LocalDateTime.now();
		String timeStamp=ldt.toString().replace(":", "-");
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//infinite time delay
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/");
		//To take Screenshot of the webpage 
		//need to down cast the webdriver referrence to TakesScreenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		// call the getScreenshotAs()
		// return type object
		// file - file object
		// Base64 - String object
		// Byte - byte[]
		// OutputType is an selenium interface
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		//Since JVM will delete the screenshot upon exit from the current session
		 //File type printing it's absolute path by calling getAbsolytePath() - return String object
		System.out.println(tempFile.getAbsolutePath());
		// Add commonIO Jar to Java-Selenium Environment
		// Move the file from temp Location to permanent location
		// Jar file will help us to create the target screenshot folder upon mentioning
		// its address in
		// File(String pathName)
		// foldername - File Name - File type extension
		File destinationFile=new File("./errorshots/DassaultHomePage"+timeStamp+".png");
		//FileUtils is the commonIO Jar
		 //Copy the physical temp screen shot file to the destined location
		try {
			FileUtils.copyFile(tempFile, destinationFile);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		//Post condition
		driver.quit();
	}
}
