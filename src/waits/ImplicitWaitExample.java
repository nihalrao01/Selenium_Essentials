package waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ImplicitWaitExample {
	public static void main(String[] args) {

		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/autocomplete");

		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
		// Implicit Wait Used Below
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		autocompleteResult.click();

		driver.quit();
	}
}
