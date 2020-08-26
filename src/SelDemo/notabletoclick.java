package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class notabletoclick {

	public static void main(String[] args) {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com");
	WebElement txtbox=driver.findElement(By.xpath("//input[@id='login-username']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='random@gmail.com'", txtbox);
	//js.executeScript("arguments[0].value=arguments[1],txtbox,"random@gmail.com");
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("document.getElementById('persistent').click()");
	/*WebElement ele= driver.findelement();
	 js2.executeScript("arguments[0].click()";ele);
	 */ 
	 
	    }
	}


