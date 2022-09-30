package webdriver_methods;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UageOfNavigateToURLurl {
	public static void main(String[] args) throws Throwable  {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URl of the application
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		//Create the object of URL class
		//Select the constructor which is type of URL(String spec)
		//Name the object as per Main URL as its to build the URL further.
		URL dassaultMainUrl=new URL("https://www.dassault-aviation.com/en/");
		//Constructor overloading
		//Select the constructor which is type of URL(URL context, String spec)
		URL dassaultSubUrl=new URL(dassaultMainUrl, "defense/");
		//Navigation object contains to() methods with same name but different arguments
		//to(String url)
		//to(URL url)
		//method overloadingq
		//pass the subUrl reference variable as input to to(URL url)
		driver.navigate().to(dassaultSubUrl);
		Thread.sleep(2000);
		URL dassaultCivilUrl=new URL(dassaultMainUrl, "civil/");
		URL dassaultSpaceUrl=new URL(dassaultCivilUrl, "space/");
		driver.navigate().to(dassaultCivilUrl);
		Thread.sleep(2000);
		driver.navigate().to(dassaultSpaceUrl);
		Thread.sleep(2000);
		//Post condition
		driver.quit();
	}
}
