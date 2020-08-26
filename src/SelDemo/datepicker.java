package SelDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Thread.sleep(3000);
		List<WebElement> daterange=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		//to print entire daterange present
		for(int i=0;i<daterange.size();i++)
		{
			String v1=daterange.get(i).getText();
			System.out.println(v1);
		}
		
		for(WebElement ele:daterange)
		{
			String value= ele.getText();
			//to print till selection
			System.out.println(value);
			if(value.equalsIgnoreCase("22"))
			{
			ele.click();
			break; 
			}
		}

	}

}
