package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfImplicatlyWait {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//implicit wait using implicitlyWait()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//Pass the main URL of the application
		driver.get("https://demo.actitime.com/login.do");
		//find the element
		WebElement userNameTF = driver.findElement(By.id("username"));
		userNameTF.clear();
		userNameTF.sendKeys("admin");
		WebElement passwordTF = driver.findElement(By.name("pwd"));
		passwordTF.clear();
		passwordTF.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://demo.actitime.com/user/submit_tt.do")) {
			if(driver.getTitle().equals("actiTIME - Enter Time-Track")) {
				System.out.println("Pass : The home Page current URL and title is verified and correct");
			}
		}else
			System.out.println("Fail : The home Page current URL and title is verified and found incorrect");
		driver.findElement(By.linkText("Logout")).click();
		if(driver.getCurrentUrl().equals("https://demo.actitime.com/login.do")) {
			if(driver.getTitle().equals("actiTIME - Login")) {
				System.out.println("Test Case Pass");
			}
		}else
			System.out.println("Test Case Failed");
		//Post condition
		driver.quit();
	}
}
