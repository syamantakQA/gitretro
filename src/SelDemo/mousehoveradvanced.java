package SelDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class mousehoveradvanced {

	public static void main(String[] args) throws Exception {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\SELENIUM\\Misc\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='hd_user_widdget']//div//i"));
		
		act.moveToElement(driver.findElement(By.xpath("//div[@id='hd_user_widdget']//div//i"))).build().perform();
		Thread.sleep(10000);
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='tip tip_top right white moreSubLinks']/ul/li"));
		System.out.println(options.size());
		String option_value;
		for(int i=0;i<options.size();i++)
			
		{
			WebElement val=options.get(i);
			option_value=val.getText();
			System.out.println(option_value);
		}
		
		ele.findElement(By.xpath("//a[contains(text(),'My Trips')]")).click();
		
		
	}

}
