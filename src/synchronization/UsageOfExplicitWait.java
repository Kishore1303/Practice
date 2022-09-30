package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfExplicitWait {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-coditions
		//Maximize the browser window
		driver.manage().window().maximize();
		//apply Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//apply Explicit wait
		//create the object of WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//Pass the main URL of the application
		driver.get("https://demo.actitime.com/login.do");
		//Find the element
		WebElement userNameTF = driver.findElement(By.name("username"));
		userNameTF.clear();
		userNameTF.sendKeys("admin");
		WebElement passwordTF = driver.findElement(By.name("pwd"));
		passwordTF.clear();
		passwordTF.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
			if(wait.until(ExpectedConditions.urlContains("https://demo.actitime.com/user/submit_tt.do"))) {
				if(wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"))) {
					System.out.println("Pass : The HomePage URL and title is verified and found Correct");
				}
			}
		}else
			System.out.println("Fail : The HomePage URL and title is verified and found Incorrect");
		driver.findElement(By.linkText("Logout")).click();
		if(driver.findElement(By.id("loginButton")).isDisplayed()) {
			if(wait.until(ExpectedConditions.urlContains("login.do"))) {
				if(wait.until(ExpectedConditions.titleContains("Login"))) {
					System.out.println("Test Case Pass successfully");
				}
			}
		}else
			System.out.println("Test Case Failed");
		//Post condition
		driver.quit();
	}
}
