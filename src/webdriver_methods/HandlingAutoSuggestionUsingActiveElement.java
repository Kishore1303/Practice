package webdriver_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutoSuggestionUsingActiveElement {
	public static void main(String[] args) {
		//Set the driver execuatble path
		System.setProperty("webdriver.chrome.driver", "/Users/kishoremv/Downloads/Selenium/chromedriver");
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//Pre condition
		//maxmize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Pass the main URl of the application
		driver.get("https://www.google.com/");
		//find the element using activeElement
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.clear();
		activeElement.sendKeys("jenkins");
		List<WebElement> jenkinsAutoSuggestion = driver.findElements(By.xpath("//li[@class=\"sbct\" and not (@id='YMXe')]"));
		//Get the count of the elements in the auto Suggestions returned by findElements()
		System.out.println("jenkinsAutoSuggestion size : "+jenkinsAutoSuggestion.size());
		//The foreach loop - Iteratively 10 Iterations
		for (WebElement auto : jenkinsAutoSuggestion) {
			System.out.println(auto.getText());
			if(auto.getText().equals("jenkins login")) {
				//Supply the wait for the condition as expected by the user
				wait.until(ExpectedConditions.textToBePresentInElement(auto, "jenkins login"));
				//Perform the action on the element which is under current iteration
				//since the condition has already been validated in the block
				auto.click();
				//Satisfied and clicked on the element
				//for the next iteration of foreach there is no actual element in webpage
				//therefore StaleElementReferenceException
				break;
				}
			}
	}
}
