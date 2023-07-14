package assignment;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormValidation {
	public static void main(String[] args) {

    	String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        
        driver.findElement(By.id("first-name")).sendKeys("Alex");
        driver.findElement(By.id("last-name")).sendKeys("Rogers");
        driver.findElement(By.id("job-title")).sendKeys("Analyst");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("2-4");
        driver.findElement(By.id("datepicker")).sendKeys("12/12/2012");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector("a[class$='btn-primary']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver,2);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated
        		(By.cssSelector("div[class$='alert-success']")));
        
        String expectedText = "The form was successfully submitted!";
        String alertText = alert.getText();
        assertEquals(alertText, expectedText);
        
        driver.quit();
    }
}
