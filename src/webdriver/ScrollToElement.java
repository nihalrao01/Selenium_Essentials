package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
	public static void main(String[] args) {

		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/scroll");

		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name);
		name.sendKeys("Alex");
		driver.findElement(By.id("date")).sendKeys("12/12/2012");
		driver.quit();
	}
}
