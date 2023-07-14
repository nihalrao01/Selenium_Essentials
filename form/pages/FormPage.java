package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	public void submitForm(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("Alex");
		driver.findElement(By.id("last-name")).sendKeys("Rogers");
		driver.findElement(By.id("job-title")).sendKeys("Analyst");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("2-4");
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2012");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector("a[class$='btn-primary']")).click();
	}
}
