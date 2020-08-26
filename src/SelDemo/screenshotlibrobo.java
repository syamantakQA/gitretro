package SelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.utility;

public class screenshotlibrobo {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		utility.robotcapturescreenshots("redbus_robo_utility");
	}


}
