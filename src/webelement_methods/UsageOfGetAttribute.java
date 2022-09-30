package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main Url of the application
		driver.get("https://en-gb.facebook.com/");
		//get the attribute expected placeholder text
		String expectedText = "Email address or phone number";
		//find the user textfield element
		WebElement emailTextField = driver.findElement(By.id("email"));
		//get the actual place holder text
		String actualText = emailTextField.getAttribute("placeholder");
		System.out.println("actual place holder text : "+actualText);
		//Compare actual and expected place holder text
		if(actualText.equals(expectedText)) {
			System.out.println("Text Case is Pass for placeholder text");
		}else
		{
			System.out.println("Text Case is failed for placeholder text");
		}
		//to verify whether email textfield is empty or not
		emailTextField.sendKeys("Kishore");
		Thread.sleep(5000);
		String emailTextFieldValue = emailTextField.getAttribute("value");
		if(emailTextFieldValue.isEmpty()) {
			System.out.println("Test case fail :  field is empty");
		}else
			System.out.println("Test case Pass :  field is not empty");
		//to verify the tooltip text
		String expectedToolTiptext = "Kannada";
		//actual tooltip text
		String actualToolTipText = driver.findElement(By.linkText("ಕನ್ನಡ")).getAttribute("title");
		if(actualToolTipText.equals(expectedToolTiptext)) {
			System.out.println("Text case Pass for tool tip text");
		}else
			System.out.println("Text case fail for tool tip text");
		//Post condition
		driver.quit();
	}
}
