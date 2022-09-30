package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
	public static void main(String[] args) throws Throwable {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URl of the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//find the element
		WebElement createAccount = driver.findElement(By.linkText("Create New Account"));
		//click on createAccount
		createAccount.click();
		Thread.sleep(5000);
		//find the male radio button
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']//parent::span//input[@class='_8esa']"));
		//check the element is selected or not by using isSelected()
		if(maleRadioButton.isSelected()) {
			System.out.println("Fail : male radio button is selected");
		}else
		{
			System.out.println("Pass : male radio button is not selected");
		}
		//Post condition
		driver.quit();
		
		
	}
}
