package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
	public static void main(String[] args) {

		// Set the property for webdriver.chrome.driver to be the location to your local
		// download of chromedriver
		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// And now use this to visit Google
		driver.get("http://www.google.com");

		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));

		// Enter something to search for
		element.sendKeys("Cheese!");

		// Now submit the form
		element.submit();

		// Close the browser
		driver.quit();
	}
}
