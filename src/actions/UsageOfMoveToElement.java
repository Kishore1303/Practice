package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfMoveToElement {
<<<<<<< HEAD
	public static void main(String[] args) {
=======
	public static void main(String[] args) throws Throwable {
>>>>>>> duplicate_master
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		//Maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//Perform action on element using Actions Class methods
		//Identify the element
		WebElement forgotPW=driver.findElement(By.linkText("Forgotten password?"));
		//Create the object of the Actions class and pass webdriver referrence as argument
		Actions actions=new Actions(driver);
		//call the moveToElement on the target element
		actions.moveToElement(forgotPW).perform();
<<<<<<< HEAD
=======
		Thread.sleep(3000);
>>>>>>> duplicate_master
		//Post condition
		driver.quit();
		
	}
}
