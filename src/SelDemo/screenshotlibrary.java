package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.utility;

public class screenshotlibrary {

	public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	utility.capturescreenshots(driver, "HomePage");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	utility.capturescreenshots(driver, "emailfield");

	}

}
