package SelDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.utility;

public class alertdemo {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.ksrtc.in/oprs-web/");
	utility.robotcapturescreenshots("sc1");
	WebElement ele=driver.findElement(By.xpath("//input [@id='searchBtn']"));
	ele.click();
	
	Thread.sleep(5000);
	Alert alt=driver.switchTo().alert();
	utility.robotcapturescreenshots("sc2");
	Thread.sleep(5000);
	String alert_msg=alt.getText();
	Thread.sleep(5000);
	System.out.println("System Defined alert message is: "+alert_msg);
	Thread.sleep(5000);
	alt.accept();
	utility.robotcapturescreenshots("sc3");
	
	
		

	}

}
