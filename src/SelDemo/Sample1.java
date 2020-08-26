package SelDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) {
	   WebDriver driver = new FirefoxDriver();
	   driver.get("http://gmail.com");
	   driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("chakraborty.syamantak86");
	   driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	   
	   driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Mouse@123");
	   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
	   if(driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).isEnabled())
	   {
		   System.out.println("I am in IF");
		   driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	   }
	   else
	   {
		   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		   System.out.println("I am in ELSE");
		   driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	   }
	   
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	   String URL=driver.getCurrentUrl();
	   System.out.println(URL);
	   if( URL.contains("https://mail.google.com/mail"))
	   {
		   System.out.println("Passed");
	   }
	   else
	   {
		   System.out.println("Failed"); 
	   }
	   
	   driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	   driver.findElement(By.id("gb_71")).click();
	   
	   
	   //driver.close();

	}

}
