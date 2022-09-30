package webdriver_methods;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageWindowSetPosition {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//Create the Point class object with target position
		Thread.sleep(2000);
		int startX=80;
		int startY=100;
		Point position = new Point(startX, startY);
		//call the setPosition()
		Thread.sleep(2000);
		driver.manage().window().setPosition(position);
		Thread.sleep(2000);
		//Post condition
		driver.quit();
	}
}
