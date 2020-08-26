package SelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class trustedsite {

	public static void main(String[] args) throws Throwable {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--ignore-certificate-errors");
	System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(option);
	driver.get("https://revoked.badssl.com/");
	}
}
