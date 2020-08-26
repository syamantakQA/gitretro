package SelDemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchtabsmultiple {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/");
		String parent=driver.getWindowHandle();
		System.out.println("Value of Parent window handle is " +parent);
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
		//driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		Set <String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		
		ArrayList <String> list =new ArrayList<>(allwindows);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//System.out.println(list.get(3));
		
		driver.switchTo().window(list.get(1));
		String child=driver.getWindowHandle();
		System.out.println("Value of Child window handle is " +child);
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("I am in Google");
		
		driver.switchTo().window(list.get(2));
		String child2=driver.getWindowHandle();
		System.out.println("Value of Child2 window handle is " +child2);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abc");
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).sendKeys(Keys.ENTER);
		
		
		
	
	}

}
