package components;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
	public static void main(String[] args) {

		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/radiobutton");

		WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
		radioButton1.click();
		WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radioButton2.click();
		WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radioButton3.click();
		
		driver.quit();
	}
}
