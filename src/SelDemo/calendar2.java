package SelDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.apache.logging.log4j.*;

public class calendar2 {

	public static void main(String[] args) throws Throwable {
		
		Logger log= LogManager.getLogger(calendar2.class.getName());
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		log.info("Application launched");
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		/*selecting current day as travel date
		
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='current day']")).click();*/
		
		/*selecting 23rd of any given month as onward journey date irrespective of weekday or weekend
		 
		List<WebElement> onward_date=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		for(int i=0;i<onward_date.size();i++)
		{
			WebElement ele= onward_date.get(i);
			String mnth_date=ele.getText();
			if (mnth_date.equalsIgnoreCase("23"))
			{
				ele.click();
                break;
			}
			
		}
		String selected_date=driver.findElement(By.xpath("//input[@type='text'and@id='onward_cal']")).getAttribute("data-caleng");
		System.out.println(selected_date);
		if (selected_date.contains("23")){
			System.out.println("TC passed");
		}*/
		
	   //validating user is not able to select any past date as travel date
		
		List<WebElement> past_date=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='past day']"));
		for(int j=0;j<past_date.size();j++)
		{
			WebElement ele= past_date.get(j);
			ele.click();
			break;
	
		}
		String selected_date=driver.findElement(By.xpath("//input[@type='text'and@id='onward_cal']")).getAttribute("data-caleng");
		System.out.println(selected_date);
		if (selected_date.isEmpty()){
			System.out.println("TC passed");
		}
		Thread.sleep(5000);
		log.error("No error identified");
		log.fatal("No fatal error occured in console ");
		log.debug("log trace should be found in console");
		driver.quit();
	}

}
