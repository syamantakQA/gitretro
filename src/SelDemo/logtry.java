package SelDemo;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import library.utility;
public class logtry {

	public static void main(String[] args) throws Throwable {
		Logger logs  = LogManager.getLogger(logtry.class.getName());
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "H:\\Udemy\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=defaul&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logs.info("Application launched");
		logs.fatal("This is fatal message");
		logs.error("This is error message");
		
		WebElement firstname= driver.findElement(By.xpath("//input[@id='firstName']"));
		utility.highLightElement(driver, firstname);
		firstname.sendKeys("abctest");
		logs.info("Firstname Provided");
		logs.debug("I am debugging");
		
		WebElement lastname= driver.findElement(By.xpath("//input[@id='lastName']"));
		utility.highLightElement(driver, lastname);
		lastname.sendKeys("chakraboz");
		logs.info("Lastname Provided");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
		utility.highLightElement(driver, username);
		username.sendKeys("abc123");
		logs.info("Username Provided");
		
		WebElement password= driver.findElement(By.xpath("//input[@name='Passwd']"));
		utility.highLightElement(driver, password);
		password.sendKeys("12bvc45&89!!!");
		logs.info("Password Provided");
		
		WebElement confirmpd= driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		utility.highLightElement(driver, confirmpd);
		confirmpd.sendKeys("12bvc45&89!!!");
		logs.info("Confirming the password");
		
		WebElement nxt= driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		utility.highLightElement(driver, nxt);
		nxt.click();
		logs.info("Next button got clicked");
		
		Thread.sleep(10000);
		WebElement errormsg=driver.findElement(By.xpath("//div[contains(text(),'That username is taken. Try another.')]"));
		utility.highLightElement(driver, errormsg);
		System.out.println(errormsg.getText());
		logs.info("----------------End of the Test---------------");
		logs.error("Finally");
		driver.quit();
		

	}

}
