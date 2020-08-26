package SelDemo;

import java.io.File;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class headless2 {

	public static void main(String[] args) {
	Logger log= LogManager.getLogger(headless2.class.getName());
	log.error("this is not an error");
		
	File src= new File("H:\\SW_Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	log.info("step1");
	System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
	log.info("step2");
	WebDriver driver= new PhantomJSDriver();
	log.info("step3");
	driver.get("https://www.google.com/");
	log.info("step4");
	System.out.println(driver.getTitle());
	log.info("end of test");
	log.debug("debug should not be printed");
	log.fatal("customization achieved");

	}

}
