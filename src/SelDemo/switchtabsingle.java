package SelDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchtabsingle {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		Set <String> allwindows=driver.getWindowHandles();
		
		for(String child:allwindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("I am in Google");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.close();
			}
		}

	}

}
