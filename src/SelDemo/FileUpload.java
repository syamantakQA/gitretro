package SelDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.utility;

public class FileUpload {
	
	public static void main(String[] args) throws IOException, Throwable
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	    System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
        utility.highLightElement(driver, upload);
        upload.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("D:\\AutoIT Scripts\\NewFileUpload.exe");
        Thread.sleep(5000);
       
	   
}

}
