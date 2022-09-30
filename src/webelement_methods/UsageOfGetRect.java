package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRect {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//Pre-condition
		driver.manage().window().maximize();
		//Pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//find the username and password element
		WebElement userNameTextField = driver.findElement(By.id("email"));
		WebElement passwordTextFiled = driver.findElement(By.id("passContainer"));
		//Verifying the left alignment
		Rectangle userNameRect = userNameTextField.getRect();
		Rectangle passwordRect = passwordTextFiled.getRect();
		//find start X co-ordinate value using getX()
		int userNameStartX = userNameRect.getX();
		int passwordStartX = userNameRect.getX();
		System.out.println(userNameStartX);
		System.out.println(passwordStartX);
		if(userNameStartX==passwordStartX) {
			System.out.println("Pass : The left alignment of username and password textfield is verified and correct");
		}else
			System.out.println("Fail : The left alignment of username and password textfield is verified and Incorrect");
		//Verifying right alignment
		//find width by using getWidth()
		int userNameEndX = userNameStartX+userNameRect.getWidth();
		int passwordEndX = passwordStartX+passwordRect.getWidth();
		System.out.println(userNameEndX);
		System.out.println(passwordEndX);
		if(userNameEndX==passwordEndX) {
			System.out.println("Pass : The right alignment of username and password textfield is verified and correct");
		}else
		System.out.println("Fail : The right alignment of username and password textfield is verified and Incorrect");
		//Post condition
		driver.quit();
	}
}
