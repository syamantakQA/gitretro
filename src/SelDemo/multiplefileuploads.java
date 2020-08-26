package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import library.utility;

public class multiplefileuploads {

	public static void main(String[] args) throws Throwable {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	    System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
        utility.highLightElement(driver, upload);
        upload.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("D:\\AutoIT Scripts\\MultipleFileupload.exe"+" "+ "C:\\Users\\Syamantak\\Desktop\\DummyDocument.docx");
        Thread.sleep(5000);
        
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        upload = driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
        utility.highLightElement(driver, upload);
        upload.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("D:\\AutoIT Scripts\\MultipleFileupload.exe"+" "+ "C:\\Users\\Syamantak\\Desktop\\workdoc.txt");
        Thread.sleep(5000);
        

	}

}
