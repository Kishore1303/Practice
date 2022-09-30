package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManagaeWindowGetPosition {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Preconditon
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//get the position of the browser window
		Point position = driver.manage().window().getPosition();
		int startX=position.getX();
		int startY=position.getY();
		System.out.println("startX : "+startX);
		System.out.println("startY : "+startY);
		//Post condition
		driver.quit();
	}
}
