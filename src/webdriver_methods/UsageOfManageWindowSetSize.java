package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageWindowSetSize {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//Re size the browser window
		//Create the Dimension class object with target height and width
		int height=400;
		int width=700;
		Dimension target=new Dimension(height, width);
		//Call the setSize()
		driver.manage().window().setSize(target);
		Thread.sleep(3000);
		//Post condition
		driver.quit();
	}
}
