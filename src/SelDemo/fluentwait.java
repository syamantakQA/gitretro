package SelDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fluentwait {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement from=driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']"));
        from.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List <WebElement> dd_menu=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content hp-widget__sfrom']//li//div"));
        for(int i=0;i<dd_menu.size();i++)
        {
        	WebElement value=dd_menu.get(i);
        	String city=value.getText();
            System.out.println(city);
        }
        WebElement city2=driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content hp-widget__sfrom']//li//div//p//span[text()='Hyderabad, India ']"));
		city2.click();
        
        	
        }
        
        
        }
        
        
        	
	

