package jsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class jsClick {

	public static void main(String[] args) throws Exception {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com");
		
		//interacting using JavaScriptExecutor
		
		//Method 1 : Using Xpath/CSS
		WebElement txtbox=driver.findElement(By.xpath("//input[@id='login-username']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='random@gmail.com'", txtbox);
		
		js.executeScript("document.getElementById('login-username').value='abc@gmail.com'");
		
		//Method 2 : Using DOM
		
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		//js2.executeScript("document.getElementById('persistent').click()");
		//same operation using Xpath
		WebElement chkbx=driver.findElement(By.xpath("//input[@id='persistent']"));
		js2.executeScript("arguments[0].click()", chkbx);
		
		

	}

}
