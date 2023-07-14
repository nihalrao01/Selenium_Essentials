package assignment;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsExample {

	public static void main(String[] args) throws Exception {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setCapability("platform", "macOS 10.12");
		browserOptions.setCapability("version", "66.0");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-nihalrao01-ee993");
		sauceOptions.put("accessKey", "99aefe25-a63a-4804-b433-0c4497916120");
		sauceOptions.put("build", "selenium-build-BEDZE");
		sauceOptions.put("name", "<your test name>");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		driver.get("http://formy-project.herokuapp.com/");
	}
}