package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		//click on login
		WebElement loginButton = driver.findElement(By.name("newbrowserwindow123"));
		loginButton.click();
		Thread.sleep(5000);
		//Get the window Id's
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String wid : allWindowIds) {
			System.out.println(wid);
			//Transfer the driver from the current window to the wid under iteration
			//Get the title of the page window under iteration
			String windowTitle = driver.switchTo().window(wid).getTitle();
			//Print the title
			Thread.sleep(3000);
			System.out.println("Window tile : "+windowTitle);
			if(windowTitle.equals("NxtGen A.I Academy – Learn With Clarity"));{
				System.out.println("PASS");
				driver.close();
			}
		}
		Thread.sleep(3000);
		//Post condition
		driver.quit();
	}
}
