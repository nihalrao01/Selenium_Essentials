package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {

		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");

		WebElement image = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDrop(image, box).build().perform();

		driver.quit();
	}
}
