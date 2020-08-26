package SelDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framedemo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		WebElement frame1=driver.findElement(By.xpath("//frame[@title='All classes and interfaces (except non-static nested types)']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//a[text()='AcceptAlert']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']"));
		driver.switchTo().frame(frame2);
		String detail=driver.findElement(By.xpath("//h2[@title='Class AcceptAlert']")).getAttribute("innerHTML");
        if(detail.equals("Class AcceptAlert"))
        {
             System.out.println("Element detail page loaded properly");	
        }
        else
        {
        	System.out.println("Element detail page not loaded properly");	
        }	
        
	}
}


