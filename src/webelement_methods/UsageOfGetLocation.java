package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		//find the element
		WebElement newMessageWindowButton = driver.findElement(By.name("newbrowserwindow123"));
		//get the position using getLocation()
		Point location = newMessageWindowButton.getLocation();
		System.out.println("startX value : "+location.getX());
		System.out.println("startY value : "+location.getY());
		//Post condition
		driver.quit();
	}
}
