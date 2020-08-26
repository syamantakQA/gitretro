package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleloginpage {
	
	WebDriver driver;
	
	By email= By.xpath("//input[@id='identifierId']");
	By next=By.xpath("//span[@class='RveJvd snByac']");
	
	public googleloginpage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement next()
	{
		return driver.findElement(next);
	}

}
