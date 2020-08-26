package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class horizopntalscrolling {

	public static void main(String[] args) throws Throwable {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement ele= driver.findElement(By.xpath("//div[@id='content-5']//li[9]//img[1]"));
	WebElement ele2= driver.findElement(By.xpath("//div[@id='content-6']//li[8]//img[1]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	Thread.sleep(15000);
	js.executeScript("arguments[0].scrollIntoView(true);", ele2);
	Thread.sleep(15000);
	//js.executeScript("scroll(900,0)");
	driver.close();
	

	}

}
