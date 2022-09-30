package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageWindowGetSize {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//Get the browser size
		Thread.sleep(3000);
		Dimension size = driver.manage().window().getSize();
		Thread.sleep(3000);
		int height=size.getHeight();
		int width=size.getWidth();
		Thread.sleep(3000);
		System.out.println(height+": window height");
		System.out.println(width+": window width");
		//Post condition
		driver.quit();
	}
}
