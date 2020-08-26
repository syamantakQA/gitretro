package SelDemo;

import org.apache.logging.log4j.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class headless {

	public static void main(String[] args) {
		
		Logger log= LogManager.getLogger(headless.class.getName());

		
		WebDriver driver= new HtmlUnitDriver();
		log.fatal("this is fatal message");
		log.error("is this an error?");
		log.info("webdriver initiatlized");
		
		driver.get("https://www.facebook.com/");
		
		log.info("facebook launched");
		System.out.println(driver.getTitle());
		log.info("end of test");

	}

}
