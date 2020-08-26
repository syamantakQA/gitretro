package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleaccountpage {
	
	WebDriver driver;
	
	
	By firstname=By.xpath("//input[@id='firstName']");
	By lastname= By.xpath("//input[@id='lastName']");
	By username= By.xpath("//input[@id='username']");
	By password= By.xpath("//input[@name='Passwd']");
	By confirmpd= By.xpath("//input[@name='ConfirmPasswd']");
	By nxt= By.xpath("//span[@class='RveJvd snByac']");
	By errormsg=By.xpath("//div[contains(text(),'That username is taken. Try another.')]");
	By signin = By.xpath("//*[text()='Sign in instead']");
	
   public googleaccountpage(WebDriver driver) {
		this.driver=driver;
	}

public WebElement firstname()
   {
	  return driver.findElement(firstname);
   }
   
   public WebElement lastname()
   {
	  return driver.findElement(lastname);
   }
   
   public WebElement username()
   {
	   return driver.findElement(username);
   }
   
   public WebElement password()
   {
	   return driver.findElement(password);
   }
   
   public WebElement confirmpd()
   {
	   return driver.findElement(confirmpd);
   }

   public WebElement nxt()
   {
	   return driver.findElement(nxt);
   }
   public WebElement errormsg()
   {
	   return driver.findElement(errormsg);
   }
   
   public WebElement signin()
   {
	   return driver.findElement(signin);
   }
   
}
