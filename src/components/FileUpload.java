package components;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FileUpload {
	public static void main(String[] args) {

		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/fileupload");

		WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
		fileUploadField.sendKeys("file-to-upload.png");

		driver.quit();
	}
}
