package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrpalogindemo {

	public static void main(String[] args) throws Exception {
    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.goibibo.com/");
    driver.findElement(By.xpath(".//*[@id='get_sign_up']")).click();
    WebElement frame_xpath=driver.findElement(By.xpath("//iframe[@id='authiframe']"));
    driver.switchTo().frame(frame_xpath);
    driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("9937187819");
    Thread.sleep(5000);
    WebElement test=driver.findElement(By.xpath(".//*[@id='mobileSubmitBtn']"));
    test.click();
    //test.sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    System.out.println("Done");

	}

}
