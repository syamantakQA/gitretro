package SelDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendar {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(5000);
		//selecting month
	    
		while(!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("NovembER"))
		{
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div[1]/a")).click();
		}
		//selecting date in any given month
		List<WebElement> available_dates= driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (int i=0; i<available_dates.size();i++)
		{
			WebElement ele=available_dates.get(i);
			String dates=ele.getText();
			if(dates.equalsIgnoreCase("5"))
			{
				ele.click();
				break;
			}
			
		}
		
		//printing selected date in console
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		String selected_date=driver.findElement(By.xpath("//td[@class='  ui-datepicker-current-day']/a")).getText();
		System.out.println("Selected Travel date is " +selected_date);
	}

}
