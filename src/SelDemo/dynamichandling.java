package SelDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import library.utility;

public class dynamichandling {

	public static void main(String[] args) {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> chk = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		
		for (int i=0;i<chk.size(); i++)
		{
			WebElement ele= chk.get(i);
			String id= ele.getAttribute("id");
			
			if (id.equalsIgnoreCase("sing"))
			{
				ele.click();
				break ;
				
			}
		}
		
		

	}

}
