package SelDemo;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplefileuploader {
	
	public static void main(String[] args) throws IOException, Exception
	{
       WebDriver driver = new FirefoxDriver();
       driver.get("file:///C:/Users/Syamantak/Desktop/fileuploader.html");
       WebElement upload = driver.findElement(By.xpath(".//*[@id='1']"));
       upload.click();
       Runtime.getRuntime().exec("C:\\Users\\Syamantak\\Desktop\\AutoIT Scripts\\FileUpload_2.exe"+" "+ "C:\\Users\\Syamantak\\Desktop\\Form.pdf");
       Thread.sleep(2000);
       upload.click();
       Runtime.getRuntime().exec("C:\\Users\\Syamantak\\Desktop\\AutoIT Scripts\\FileUpload_2.exe"+" "+ "C:\\Users\\Syamantak\\Desktop\\Out.pdf");
       
	   
}

}
