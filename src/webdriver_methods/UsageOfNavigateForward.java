package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateForward {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pre-condition
		driver.manage().window().maximize();
		//Pass the main URl of the application
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		//Identify the element and click on it
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement pythonPage = driver.findElement(By.xpath("//span[text()='PYTHON FOR DATA SCIENCE']"));
		pythonPage.click();
		driver.navigate().back();
		Thread.sleep(2000);
		if(driver.getTitle().contains("NxtGen A.I Academy – Learn With Clarity")) {
			//Forware webpage
			driver.navigate().forward();
			System.out.println("Pass");
		}else
			System.out.println("Fail");
		Thread.sleep(6000);
		//Post condition
		driver.quit();
	}
}
