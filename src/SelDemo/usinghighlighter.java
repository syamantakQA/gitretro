package SelDemo;


import org.apache.logging.log4j.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import library.utility;
import objectRepository.googleaccountpage;
import objectRepository.googleloginpage;

public class usinghighlighter {

	public static void main(String[] args) throws Throwable {
		
	 Logger log = LogManager.getLogger(usinghighlighter.class.getName());
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=defaul&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	log.info("Using Page object model");
	
	googleaccountpage ac= new googleaccountpage(driver);
	
	utility.highLightElement(driver, ac.firstname());
	ac.firstname().sendKeys("abctest");
	log.debug("successfully entered details in firstname");
	
	utility.highLightElement(driver, ac.lastname());
	ac.lastname().sendKeys("chakraboz");
	log.debug("successfully entered details in lastname");
	
	utility.highLightElement(driver, ac.username());
	ac.username().sendKeys("abc123");
	log.debug("successfully entered details in username");
	
	utility.highLightElement(driver, ac.password());
	ac.password().sendKeys("12bvc485");
	log.debug("successfully entered details in password");
	
	utility.highLightElement(driver, ac.confirmpd());
	ac.confirmpd().sendKeys("12bvc485");
	log.debug("successfully entered details in confirmpd");
	
	utility.highLightElement(driver, ac.nxt());
	ac.nxt().click();
	log.debug("successfully clicked on Submit button");
	
	Thread.sleep(10000);
	
	utility.highLightElement(driver, ac.errormsg());
	System.out.println(ac.errormsg().getText());
	log.debug("successfully printed the error message");
	
	utility.highLightElement(driver, ac.signin());
	ac.signin().click();
	log.debug("successfully navigated  to signin page");
	Thread.sleep(10000);
	//driver.quit();
	
	googleloginpage lp= new googleloginpage(driver);
	
	utility.highLightElement(driver, lp.email());
	lp.email().sendKeys("syamaii");
	log.debug("successfully submitted email in  sign page");
	
	utility.highLightElement(driver, lp.next());
	lp.next().click();
	log.debug("successfully clicked on next button in  sign page");

	
	}

}
