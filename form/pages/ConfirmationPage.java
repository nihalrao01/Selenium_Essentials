package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
	public void waitForAlertBanner(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class$='alert-success']")));
	}

	public String getAlertBannerText(WebDriver driver) {
		return driver.findElement(By.cssSelector("div[class$='alert-success']")).getText();
	}
}
