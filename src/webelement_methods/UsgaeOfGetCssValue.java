package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UsgaeOfGetCssValue {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		String mainUrl="https://www.facebook.com/";
		driver.get(mainUrl);
		//Verify the background color of login button
		//find the login button element
		WebElement loginButton = driver.findElement(By.name("login"));
		//Pass the css property name as an input to getCssValue()
		String loginButtonBackgroundColor = loginButton.getCssValue("background-color");
		System.out.println(loginButtonBackgroundColor);
		//Post condition
		//Converting RGB value to hexdecimal code
		String expectedHexaCode="#1877f2";
		String actualHexaCode = Color.fromString(loginButtonBackgroundColor).asHex();
		if(actualHexaCode.equals(expectedHexaCode)) {
			System.out.println("Test Case Pass : "+actualHexaCode);
		}else
			System.out.println("Test Case Fail");
		//Post condition
		driver.quit();
	}
}
