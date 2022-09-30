package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfScrollHeightAndScrollWidth {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.dassault-aviation.com/en/defense/");
		//to print webpage height and width of scroll
		//downcast driver to JavaScriptExecutor interface
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//call executeScript()
		//to identify webpage height in pixels
		//print the height
		long webpageHeight = (long)jse.executeScript("return document.body.scrollHeight;");
		//to identify the webpage width in pixels
		//to print the width
		long webpageWidth=(long)jse.executeScript("return document.body.scrollWidth;");
		System.out.println("webpageHeight : "+webpageHeight);
		System.out.println("webpageWidth : "+webpageWidth);
		driver.quit();	
	}
}
