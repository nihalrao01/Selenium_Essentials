package testCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConfirmationPage;
import pages.FormPage;

public class FormTest {

	public static void main(String[] args) {
		String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");

		FormPage formpage = new FormPage();
		formpage.submitForm(driver);

		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);

		String expectedText = "The form was successfully submitted!";
		assertEquals(confirmationPage.getAlertBannerText(driver), expectedText);

		driver.quit();
	}
}
