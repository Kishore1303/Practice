package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwitchTo {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://nxtgenaiacademy.com/");
		//click on element
		driver.findElement(By.xpath("//span[text()='QA Automation']")).click();
		driver.findElement(By.xpath("//span[text()='Practice Automation']")).click();
		driver.findElement(By.xpath("//span[text()='Demo Site – Multiple Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button1")).click();
		//Capture the window ID by using getWindowHandles()
		Set<String> windowIDs = driver.getWindowHandles();
		Thread.sleep(2000);
		String[] str= {};
		for (String wid : windowIDs) {
			System.out.println("window : "+wid);
			String windowTitle = driver.switchTo().window(wid).getTitle();
			System.out.println("windowTitle : "+windowTitle);
			if(windowTitle.equals("NxtGen A.I Academy – Learn With Clarity")) {
				 Dimension size = driver.manage().window().getSize();
				 System.out.println("Height : "+size.getHeight());
				 System.out.println("Width : "+size.getWidth());
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[0]);
		}
		Thread.sleep(2000);
		//Post condition
		driver.quit();
	}
}
