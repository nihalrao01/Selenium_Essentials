package components;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

    	String driverpath = "C:\\Users\\nihal\\eclipse\\java-2023-06\\eclipse\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
        
        driver.quit();
    }
}
