package SelDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import library.utility;

public class framehandling {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		/*driver.get("https://www.w3.org/WAI/UA/TS/html401/cp0101/0101-FRAME-TEST.html");
		driver.switchTo().frame("target1");
		driver.findElement(By.xpath("//a[text()='Test Link 1']")).click();
		driver.switchTo().defaultContent();
		WebElement customframe=driver.findElement(By.xpath("//frame[@title='Frame Test Suite Target 2']"));
		driver.switchTo().frame(customframe);
		driver.findElement(By.xpath("//a[text()='Test Link 2']")).click();;
		*/
		
		driver.get("https://demoqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Skip to content']")).click();
		driver.switchTo().defaultContent();
	
			}
		
		
		

	}


