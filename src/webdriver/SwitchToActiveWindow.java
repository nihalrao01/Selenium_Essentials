package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
	public static void main(String[] args) {

		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/switch-window");

		WebElement newTabbtn = driver.findElement(By.id("new-tab-button"));
		newTabbtn.click();
		String orgHandle = driver.getWindowHandle();
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		driver.switchTo().window(orgHandle);
		driver.quit();
	}
}
