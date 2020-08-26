package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class scrollintoview {

	public static void main(String[] args) throws Throwable {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement ele= driver.findElement(By.xpath("//div[@id='content-2']//p[13]"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	Thread.sleep(5000);
	System.out.println(ele.getText());
	js.executeScript("scroll(0,8000)");
	Thread.sleep(5000);
	js.executeScript("scroll(0,-2000)");
	Thread.sleep(5000);
	driver.quit();

	}

}
