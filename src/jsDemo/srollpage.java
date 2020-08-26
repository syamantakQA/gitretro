package jsDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class srollpage {

	public static void main(String[] args) throws Exception {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://learn-automation.com/how-to-write-dynamic-xpath-in-selenium/");
    driver.manage().window().maximize();
	Thread.sleep(5000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("scroll(0,5200)");
    Thread.sleep(5000);
    js.executeScript("scroll(0,-1750)");
    Thread.sleep(5000);
    driver.quit();

	}

}
